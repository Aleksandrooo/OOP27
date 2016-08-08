package lesson7;

import java.util.ArrayList;

public class Firm {

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
	
	String firmName;
	String firmAdress;
	double firmSum;
	ArrayList<Employee>  employees = new ArrayList<Employee>();
	
	public Firm(String firmName, String firmAdress, double firmSum, ArrayList<Employee>  employees){
		this.firmName = firmName;
		this.firmAdress = firmAdress;
		this.firmSum = firmSum;
	}
	
	public boolean addEmployee(String name, String surname, int salarySum, long personalCardAccount, String gender, String department){
		Employee emp = new Employee(name, surname, salarySum, personalCardAccount, gender, department);
		boolean added = false;

//		for(Employee e : employees){
//
//		}
		for( int i = 0; i < employees.size(); i++){
			if((!(employees.get(i).surname.equals(surname))) | (!(employees.get(i).name.equals(name)))  ){
				added = true;
				break;
			}
		}
		if(!added){
			employees.add(emp);
		}
		return !added;
	}
	
	public boolean dismissEmployee(String name, String surname){
		boolean dismissed = false;
		for( int i = 0; i < employees.size(); i++){
			if((employees.get(i).surname.equals(surname)) & (employees.get(i).name.equals(name))  ){
				employees.remove(i);
				dismissed = true;
				break;
			}
		}
		return dismissed;
	}
	
	public ArrayList<Employee> getAllEmployees(){

		return new ArrayList<Employee>(employees);
	}
	
	public ArrayList<Employee> getAllEmployeesOrderedBySalary(){
		ArrayList<Employee> employeesSort = new ArrayList<Employee>();
//		for( int i = 0; i < employees.size(); i++){
//			
//		}
		employeesSort = employees;
		selectionSort(employeesSort);
		return employeesSort;
	}
	
	public static void selectionSort(ArrayList<Employee> array){
		for(int i = 0; i< array.size() -1; i++){
			int minIndex =i;
			for(int j = i+ 1; j< array.size();j++){
				if ( array.get(j).salarySum < array.get(minIndex).salarySum){
					minIndex = j;
				}
			}
			swap(array, i, minIndex);
		}
	}
	
	public static void swap(ArrayList<Employee> array, int i , int j){
		Employee tmp;
//		tmp = new Employee(array.get(i));
//		array.get(i) = array.get(j);
//		array.get(j) = tmp;

	}
	
}
