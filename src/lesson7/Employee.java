package lesson7;

public class Employee {
	//У каждого сотрудника (Employee) есть имя, фамилия, ставка зарплаты (сумма), его личный карточный счет (сумма), пол, отдел.
	//Обычный сотрудник:  - Фамилия - Имя	- Отчество	- Пол	- Ставка зарплаты	- Зарплатный счет	- Отдел
	String surname;
	String name;
	String patronymic;
	String gender;
	int salarySum;
	long personalCardAccount;
	String department;
	
	public Employee(String surname, String name, String patronymic, int salarySum, long personalCardAccount, String gender, String department){
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
	

}
