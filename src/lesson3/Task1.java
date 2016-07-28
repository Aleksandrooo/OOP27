package lesson3;

import javax.swing.SingleSelectionModel;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] muss = {11, 23, 56, 88, 12, 3};
				bubbleSort(muss);

	}
	
	public static void bubbleSort(int [] array){
		int buffer, count=0;
		boolean hasChange = true;
		
		for(int i = 0; hasChange;i++){
			hasChange = false;
			for(int j = 0; j< array.length -1 -i;j++){
				if(array[j] > array[j+1]){
					buffer = array[j+1];
					array[j+1] = array[j];
					array[j] = buffer;
					hasChange = true;
				}
				count++;
			}
		}
		for(int i = 0; i< array.length;i++){
			System.out.println(array[i]);
			
		}
		System.out.println("count " + count);
	}

}
