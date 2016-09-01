package lesson7;

import java.util.Comparator;

public class Employee {
	//У каждого сотрудника (Employee) есть имя, фамилия, ставка зарплаты (сумма), его личный карточный счет (сумма), пол, отдел.
	//Обычный сотрудник:  - Фамилия - Имя	- Отчество	- Пол	- Ставка зарплаты	- Зарплатный счет	- Отдел
	public static final Comparator<Employee> BY_SURNAME = (p1, p2) -> p1.surname.compareTo(p2.surname);
	public static final Comparator<Employee> BY_NAME = (p1, p2) -> p1.name.compareTo(p2.name);
	public static final Comparator<Employee> BY_PATRONYMIC = (p1, p2) -> p1.patronymic.compareTo(p2.patronymic);
	public static final Comparator<Employee> BY_GENDER = (p1, p2) -> p1.gender.compareTo(p2.gender);
	public static final Comparator<Employee> BY_SALARYSUM = (p1, p2) -> p1.name.compareTo(p2.name);
	public static final Comparator<Employee> BY_DEPARTMENT = (p1, p2) -> p1.department.departmentName.compareTo(p2.department.departmentName);


	String surname;
	String name;
	String patronymic;
	String gender;
	int salarySum;
	long personalCardAccount;
	//String department;
	Department department;
	
	public Employee(String surname, String name, String patronymic, int salarySum, long personalCardAccount,
					String gender, Department department){
		if((name.length() != 0) &  (surname.length() != 0) & (patronymic.length() != 0)){
			this.surname = surname;
			this.name = name;
			this.patronymic = patronymic;
			this.salarySum = salarySum;
			this.personalCardAccount = personalCardAccount;
			this.gender = gender;
			this.department = department;
		}
	}

	public void takeSalary(){
		personalCardAccount += salarySum;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %d, %d, %s, %s", name, surname, patronymic, salarySum, personalCardAccount, gender, department.departmentName );
	}

}
