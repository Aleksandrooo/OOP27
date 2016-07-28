package lesson4;

public class HomeWork2 {

	public static void main(String[] args) {
//		1. void revers(int val) - Метод выводит в консоль число наоборот
//		Пример : revers(1234); // в консоли 4321
				
		System.out.println(revers(10));		
	}
	
//	public static int revers(int val){
//	if( n < 10){
//		
//	}
	//}
	public static int revers(int val){
		int result = 0;
		String str = "";
		char [] ch = Integer.toString(val).toCharArray();
		for (int i = ch.length -1; i >=0; i--){
			str += ch[i];
		}
		return result += Integer.parseInt(str);
	}
	
}
