package lesson4;

public class Task2 {

	public static void main(String[] args) {
		// Рекурсия
		//f(10, 20);
		//System.out.println(sum (1, 3));
		
		// Факториал 
		// условие  fact (0) = 1;
		// fact (n)= n* fact(n-1)
		//System.out.println(factorial( 5));
		
		// Возведение в степень числа  
		// // pow(n,m)  возведение в  степень  м  число n     n(m) = n* (m-1)
		System.out.println( power(2, 8) );
	}
	
	public static int powerV2(int n, int m){
		return m ==0 ? 1 : n*powerV2(n, m - 1);
	}

	public static int power(int n, int m){
		if(m == 0 ){
			return 1;
		} else{
			if(m == 1){
				return n;
			} else {
				return n*power(n, m - 1);
			}
		}
	}

	public static int factorial(int n){
		if(n == 0 || n == 1){
			return 1;
		} else{
			return n*factorial(n - 1);
		}
	}
	
	public static void f(int count, int limit){
		System.out.println(count);
		if (count >= limit ) {
			//return;
			//f(count - 1, 10);
			System.out.println(count);
			return;
		}
		f(count +1, limit);
		System.out.println(count);
	}
	
	public static int sum(int start, int end){
		
		if (start == end){
			return end;
		}
//		int recResult = sum(start + 1, end);
//		int res = start + recResult;
//		return res;
		
		//или
		return start + sum(start + 1, end);
	}
}
