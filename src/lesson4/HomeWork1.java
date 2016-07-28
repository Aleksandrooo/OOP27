package lesson4;

public class HomeWork1 {

	public static void main(String[] args) {
//		0. int sum(int val) - Метод возвращает сумму всех цифр числа
//		Пример :  int res = sum(1234); // res = 10
				
		System.out.println(sum(100000001));		
				
	}
	
	public static int sum(int val){
		int result = 0;
		char [] ch = Integer.toString(val).toCharArray();
		for (int i = 0; i < ch.length; i++){
			result += Character.getNumericValue(ch[i]);
		}
		
		return result;
	}
	
//	 public static int sum(int n) {
//		  return n == 0 ? 0 : sum(n / 10) + (n % 10);
//		 }
}
