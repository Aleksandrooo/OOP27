package lesson7;

/**
 * Created by Admin on 10.08.2016.
 */
public class Manager extends Employee {
	Department managerOfDepartment;

	public Manager(String surname, String name, String patronymic, int salarySum, long personalCardAccount,
			String gender, Department department) {
		super(surname, name, patronymic, salarySum, personalCardAccount, gender, department);

        managerOfDepartment = department;

	}
}
