package lesson7;

public class Number {
//	  Написать класс число (Number), хранящий целое число и выполняющий следующие операции:
//	- получение примитива (метод int get())
//	- сложение (метод Number add(Number num))
//	- вычитание (метод Number sub(Number num))
//	- умножение (метод Number mul(Number num))
//	- деление (метод Number div(Number num))
//	- возведение в степень (метод Number pow(Number exponent))
//	- вычисление факториала (метод Number fact())
//	- вычисление остатка от деления (метод Number mod(Number num)) 
	int number;
	
	public Number(int value){

		this.number = value;
	}
	public Number(){

	}
	
	public int get(){
		return number;
	}
	
	public Number add(Number num){
		//Number  value = null ;
		//value.number = number + num.get();
		return new Number(this.number + num.number);
	}
	
//	public Number sub(Number num){
//		return this.number - num;
//	}
//	
//	public Number mul(Number num){
//		return this.number * num;
//	}
//	
//	public Number div(Number num){
//		return this.number / num;
//	}
//	
//	public Number pow(Number num){
//		return this.number / num;
//	}
//	
//	public Number fact(Number num){
//		return this.number / num;
//	}
//	
//	public Number fact(Number num){
//		return this.number % num;
//	}

}

/*
3. Написать класс фирма (Firm), содержащий имя, адрес, зарплатный счет (сумма), список сотрудников.
У каждого сотрудника (Employee) есть имя, фамилия, ставка зарплаты (сумма), его личный карточный счет (сумма), пол, отдел.

Класс фирма должен выполнять следующие функции:

- Добавить сотрудника (метод boolean addEmployee(Employee employee))

- Уволить сотрудника по имени и фамилии (метод boolean fireEmployee(String name, String surname))

- Получить список всех сотрудников фирмы (метод ArrayList<Employee> getAllEmployees())

- Получить список всех сотрудников фирмы отсортированных по зарплате (метод ArrayList<Employee> getAllEmployeesOrderedBySalary())

- Выдать всем сотрудникам зарплату (перевести на карточный счет каждого сотрудника, сумму равную зарплате сотрудника с главного счета фирмы, если на счету фирмы не хватает средств - выдать сколько хватит =)) (метод void giveSalaryForAll())

4*. Написать консольное меню для управления фирмой, пункты меню соответствует функционалу самой фирмы. */