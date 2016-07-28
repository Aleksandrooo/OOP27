package lesson1;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = new int [10];
		int [] array2 =	{2, 5, 7, 8, 3, 0};
		int [][] array3 =	{
				{2, 5}, 
				{7},
				{8, 3, 0}};
//		System.out.println(array.length);
//		System.out.println(array[0]);
		array[0] = 99;
		array[1] = 23;
//		array[] = {2, 5, 7, 8, 3, 0}; 
		
		
		float f = 5.5F;
		double d = 5F/2;
		char ch = 'A';
		String str = "Hello word";
		boolean b = true;
		
		int val = 010;
		
		ArrayList<String> list= new ArrayList<String>();
		ArrayList<Integer> list2= new ArrayList<Integer>();
		list2.add(3);
		list2.add(20);
		list2.add(5);
		list2.add(8);
		list2.add(21);
		System.out.println(list2);
		list2.removeIf((e) -> e % 2 != 0);
		
//		list2.removeIf((elem) ->
//		{System.out.println(elem);
//			if
//			
//		}e % 2 != 0);
		
		System.out.println(list2);
		list.forEach(( e) -> System.out.println(e));
		removeAllOdd(list2);
		
		
//		System.out.println(list2);
//		list2.add(1, 999);
//		list2.set(2, 77);
//		list2.remove(1);
//		
//		System.out.println(list2.get(0));
//		System.out.println(list2.contains(10));
//		System.out.println(list2.indexOf(777));
//		System.out.println(list2);
//		System.out.println(list2.size());
		
	}
	
	public static void removeAllOdd(ArrayList<Integer> list2){
		for(int i =0; i < list2.size(); i++){
			if(list2.get(i) %2 !=0){
				list2.remove(i);
				i--;
			}
			
		}
		System.out.println(list2);
	}
	
	public static int sum(int[] array){
		int result =0;
		for(int i =0; i < array.length; i++){
			result += array[i];
		}
		return result;
		
	}

}
