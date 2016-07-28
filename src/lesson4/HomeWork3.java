package lesson4;

public class HomeWork3 {

	public static void main(String[] args) {
		// //		2. int fib(int val) - метод возвращает значение по порядковому номеру из ряда Фибоначчи.
//		Пример : int res = fib(7) // res = 13;
//		https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8

		System.out.println(fibonacciVal(8));		
	}
	
	public static int fibonacciVal2(int n){
		if(n==0 || n==1){
			return n;
		}
		return fibonacciVal2(n-1) + fibonacciVal2(n-2);
		
	}
	
	public static int fibonacciVal(int val){
		int result = 0;
		int f1 = 0, f2 =1;
		if(val == 0){
			return 1;
			} else {
				if(	val == 1){
					return 1;
				} else {
					for (int i = 2; i < val; i++){
						result = f1 + f2;
						f1 = f2; 
						f2 = result;
					}
				}
			}
		return result ;
	}
}
