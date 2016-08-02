package lesson6;

public class Fraction {
//	2. Написать класс дробь (Fraction), хранящий числитель и знаменатель и выполняющий следующие действия:
//		- сложение дробей (метод Fraction add(Fraction frac))
//		- вычитание (метод Fraction sub(Fraction frac))
//		- умножение (метод Fraction mul(Fraction frac))
//		- деление (метод Fraction div(Fraction frac))
//		- приведение к строке(метод String toString())
//		- вывод (метод void print())
	
	int numerator;
	int denominator;
	
	public  Fraction(int numerator, int denominator){
		if(denominator != 0){
			this.numerator = numerator;
			this.denominator = denominator;
		}
		
	}
	
	
	public Fraction add(Fraction frac){
		return frac;
	}
	
	public Fraction sub(Fraction frac){
		return frac;
	}
	
	public Fraction mul(Fraction frac){
		return frac;
	}
	
	public Fraction div(Fraction frac){
		return frac;
	}
	public String toString(){
		return Integer.toString(numerator) + Integer.toString(denominator);
	}
	public void print(){
		System.out.println("Дробь " + numerator + "/" + denominator);
	}

}
