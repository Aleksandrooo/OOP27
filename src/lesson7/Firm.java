package lesson7;

import java.util.ArrayList;
import java.util.Collections;

public class Firm {
	/*	3. Написать класс фирма (Firm), содержащий имя, адрес, зарплатный счет (сумма), список сотрудников.
	У каждого сотрудника (Employee) есть имя, фамилия, ставка зарплаты (сумма), его личный карточный счет (сумма), пол, отдел.
Класс фирма должен выполнять следующие функции:
	- Добавить сотрудника (метод boolean addEmployee(Employee employee))
	- Уволить сотрудника по имени и фамилии (метод boolean fireEmployee(String name, String surname))
	- Получить список всех сотрудников фирмы (метод ArrayList<Employee> getAllEmployees())
	- Получить список всех сотрудников фирмы отсортированных по зарплате (метод ArrayList<Employee> getAllEmployeesOrderedBySalary())
	- Выдать всем сотрудникам зарплату (перевести на карточный счет каждого сотрудника, сумму равную зарплате сотрудника с главного счета фирмы, если на счету фирмы не хватает средств - выдать сколько хватит =)) (метод void giveSalaryForAll())
	4*. Написать консольное меню для управления фирмой, пункты меню соответствует функционалу самой фирмы. */

	public String firmName;
	public String firmAdress;
	public double firmSum;
	public ArrayList<Employee>  employees;
	public ArrayList<Department>  department;
	
	public Firm(String firmName, String firmAdress, double firmSum){
		this.firmName = firmName;
		this.firmAdress = firmAdress;
		this.firmSum = firmSum;
		this.employees = new ArrayList<Employee>();
		this.department = new ArrayList<Department>();
	}

	public String getFirmName(){
		return firmName;
	}

	public boolean addDepartment(Department department){
		if(this.department.size() != -1){
			for (Department d : this.department ) {
				if (d.departmentName.equals(department.departmentName)) {
					return false;
				}
			}
		}
		this.department.add(department);
		return true;

	}
//	public boolean addEmployee(String name, String surname, int salarySum, long personalCardAccount, String gender,
//							   String department){
	public boolean addEmployee(Employee employee){
		if(employees.isEmpty()){
			if(findEmployee(employees, employee)){
					return false;
			}
		}
		employees.add(employee);
		employee.department.employeesList.add(employee);
		return true;
	}

	public boolean fireEmployee(String surname, String name, String patronymic){
		for(Employee e : employees){
			if((e.surname.equals(surname)) && (e.name.equals(name)) && (e.patronymic.equals(patronymic))){
				employees.remove(e);
				e.department.employeesList.remove(e);
				return true;
			}
		}
		System.out.println(surname + name + patronymic + " - такой сотрудник не найден");
		return false;
	}

	public boolean findEmployee(ArrayList<Employee> employees, Employee emp ){
		return findEmployee(employees, emp.surname, emp.name, emp.patronymic);
	}
	public boolean findEmployee(ArrayList<Employee> employees, String surname, String name, String patronymic ){
		for(Employee e : employees) {
			if ((e.surname.equals(surname)) && (e.name.equals(name)) && (e.patronymic.equals(patronymic))) {
				return true;
			}
		}
		return false;
	}

	public boolean setDepartmentForEmployee(String name, String surname, String patronymic, String departmentName){
		return false;
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

	public ArrayList<Employee> getAllEmployeesOrderedByName(){
		ArrayList<Employee> employeesSort = new ArrayList<Employee>(employees);
		Collections.sort(employeesSort, Employee.BY_NAME);
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
	public void printFirm (){
		System.out.println("Фирма: " + firmName  + " адрес - " + firmAdress + " " + firmSum);
		for (Department d: department ) {
			System.out.println("Отдел: " + d.departmentName);
		}
		for(Employee e: employees){
			System.out.printf("Сотрудник: %s  %s %s \n\r" ,e.surname, e.name, e.patronymic);
		}
	}
}

/*
[16:54:26] Stefan It-Centre: Домашка
		[16:54:28] Stefan It-Centre:  
		класс фирма (Firm), содержащий имя, адрес, главный счет (сумма), список отрудников, список отделов.

		На фирме должны работать следующие сотрудники:
		Employee, Manager, SalesManager

		Обычный сотрудник: 
		- Фамилия
		- Имя
		- Отчество
		- Пол
		- Ставка зарплаты
		- Зарплатный счет
		- Отдел

		Менеджер:
		все что и у обычного +
		- подчиненный отдел

		(зп считается - ставка + по 50 за подчиненного)

		Продавец :
		все что и у обычного +
		- продажи
		(зп считается - ставка + 30% от продаж)

		Отдел :(Класс Department)
		- Название отдела
		- Список сотрудников в отделе
		- Менеджер отдела

		Фирма:
		- добавить сотрудника на фирму (метод boolean addEmployee(Employee employee))
		- уволить сотрудника по ФИО, (метод boolean fireEmployee(String name, String surname, String patronymic))
		- перевести сотрудника в отдел (метод boolean setDepartmentForEmployee(String name, String surname, String patronymic, String departmentName))
		-------------------------------------------------------
		- получить список всех сотрудников (метод ArrayList<Employee> пуеAllEmployees())
		- получить список всех сотрудников, отсортированных по зп (метод ArrayList<Employee> getAllEmployeesSortedBySalary())
		- получить список всех сотрудников, отсортированных по фамилии (метод ArrayList<Employee> getAllEmployeesSortedBySName())
		-------------------------------------------------------
		- получить список всех сотрудников в указанном отделе (метод ArrayList<Employee> getEmployeesFromDep(String departmentName))
		- получить список всех сотрудников в указанном отделе, отсортированных по зп
		(метод ArrayList<Employee> getEmployeesFromDepSortedBySalary(String departmentName))
		- получить список всех сотрудников в указанном отделе, отсортированных по фамилии
		(метод ArrayList<Employee> getEmployeesFromDepSortedBySName(String departmentName))
		-------------------------------------------------------
		- всем продавцам продать на сумму 10000, (метод void sellFor10())
		- Выдать всем сотрудникам зарплату (перевести на карточный счет каждого сотрудника, сумму равную зарплате сотрудника 
		с главного счета фирмы, если на счету фирмы не хватает средств - выдать сколько хватит =)) (метод void giveSalaryForAll())
		-------------------------------------------------------
		-* нанять сотрудника, снять с зарплаты сотрудников отдела зарплату для новичка
		-* после любой изменяющей операции сохранять фирму в файл
		-------------------------------------------------------
		* Написать консольное меню для управления фирмой, пункты меню соответствует функционалу самой фирмы.*/