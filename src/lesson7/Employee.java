package lesson7;

public class Employee {
	//У каждого сотрудника (Employee) есть имя, фамилия, ставка зарплаты (сумма), его личный карточный счет (сумма), пол, отдел.
	String name;
	String surname;
	String middleName;
	int salarySum;
	long personalCardAccount;
	String gender;
	String Department;
	
	public Employee(String name, String surname, int salarySum, long personalCardAccount, String gender, String Department){
		if((name.length() != 0) &  (surname.length() != 0)){
			this.name = name;
			this.surname = surname;
			this.salarySum = salarySum;
			this.personalCardAccount = personalCardAccount;
			this.gender = gender;
			this.surname = surname;
			this.Department = Department;
		}
	}
	

}
