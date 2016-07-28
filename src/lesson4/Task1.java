package lesson4;

import java.lang.reflect.Array;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {11, 5, 23, 1, 56, 88, 88, 999, 12, 3, 0};
		//selectionSort(array);
		//shakerSort(array);
		//chet_Nechet(array);
		
		//сomboSort(array);
		//insert(array);
		
		shellSort(array);
		//qSort(array);
		
		for(int i = 0; i< array.length;i++){
			System.out.print(array[i] + ", ");
		}
	}
	
	
	/*public static void insertion(int[] array) {

  for (int i = 1; i < array.length; i++) {
   for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
    lesson3.Task2.swap(array, j - 1, j);
   }
  }
 } */
	
	public static void shellSort(int[] array) {
		  int step = array.length / 2;
		  while (step > 0) {
		   for (int i = 0; i < (array.length - step); i++) {
		    int j = i;
		    while (j >= 0 && (array[j] > array[j + step])) {
		     int temp = array[j];
		     array[j] = array[j + step];
		     array[j + step] = temp;
		     j--;
		    }

		   }
		  }
		 }
	
	
	public static void insert(int [] array){
			
		for(int j = 0; j< array.length -1; j++){
			if ( array[j] > array[j + 1]){
				swap(array, j, j + 1);
				for(int i = j + 1; i>= 2; i--){
					if(array[i - 2] > array[i -1]){
					swap(array, i - 2, i -1 );
					} else{
						i=0;
					}	
				}
			}			
		}
	}
	
	public static void сomboSort(int [] array){
		int step = (int) (array.length / 1.247); // + (int) (array.length % 1.247);
		boolean flag = false;
		
		for(int i = 0; i< array.length -1; i++){
			for(int j = 0; j< array.length - step ; j++){
				if ( array[j] > array[j + step]){
					swap(array, j, j + step);
				}
				for(int l = 0; l< array.length;l++){
					System.out.print(array[l] + ", ");
					if(l == array.length - 1) System.out.println(""); 
					
				}
			}
			step = (int)(step / 1.247); // + (int) (step % 1.247);
		}
		
	}
	
	public static void chet_Nechet(int [] array){
		for(int i = 0; i< array.length -1; i++){
			for(int j = 0; j< array.length -1; j+=2){
				if ( array[j] > array[j + 1]){
					swap(array, j, j + 1);
				}
			}
			for(int j = 1; j< array.length -1; j+=2){
				if ( array[j] > array[j +1]){
					swap(array, j, j + 1);
				}
			}
		}
	}
	
	public static void shakerSort(int [] array){
		
		int left = 0; 
		int right = array.length ;
		
		for(int i = 0; i< array.length -1; i++){
			for(int j = 0; j< array.length -1 -i;j++){
				if ( array[j] > array[j + 1]){
					swap(array, j, j + 1);
				}
			}
			for(int j = array.length -1; j > 2 + i ; j--){
				if ( array[j - 2] > array[j - 1]){
					swap(array, j - 2, j - 1);
				}
			}
		}
	}

	public static void selectionSort(int [] array){
		for(int i = 0; i< array.length -1; i++){
			int minIndex =i;
			for(int j = i+ 1; j< array.length;j++){
				if ( array[j] < array[minIndex]){
					minIndex = j;
				}
			}
			swap(array, i, minIndex);
		}
	}
	
	public static void swap(int [] array, int i , int j){
		int tmp;
		tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
}