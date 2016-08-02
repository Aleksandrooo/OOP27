package lesson6;

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
	ArrayList<String> Employee = new ArrayList<String>(); 
	
	
}
