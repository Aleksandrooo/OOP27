package lesson4;

import java.util.Arrays;

public class HomeWork4 {

	public static void main(String[] args) {
		// //
//		3*(Повышенной сложности). void permute(int[] arr, int idx) - метод выводит в консоль все возможные варианты перестановок значений данного массива.
//		Пример : 
		int[] arr = {1, 2, 3};
//		permute(arr, 0);
//		// В консоли :
//		[1, 2, 3]
//		[1, 3, 2]
//		[2, 1, 3]
//		[2, 3, 1]
//		[3, 2, 1]
//		[3, 1, 2]
		
		permute(arr,  0);
		
	}
		
		public static void permute(int[] arr, int idx) {
			  
			  if (idx == arr.length - 1) {
			   System.out.println(Arrays.toString(arr));
			   return;
			  }

			  for (int i = idx; i < arr.length; i++) {
			   
			   swap(arr, idx, i);
			   permute(arr, idx + 1);
			   swap(arr, idx, i);
			  }

		 }

			 public static void swap(int[] array, int i, int j) {
			        int buff = array[i];
			        array[i] = array[j];
			        array[j] = buff;
			}
		
}
	


