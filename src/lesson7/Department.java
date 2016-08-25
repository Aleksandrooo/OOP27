package lesson7;

import java.util.ArrayList;

/**
 * Created by Admin on 10.08.2016.
 */
public class Department {
//    Отдел :(Класс Department)
//            - Название отдела
//		- Список сотрудников в отделе
//		- Менеджер отдела

    String departmentName;
    ArrayList<Employee> employeesList;
    Manager managerOfDepartment;

    public Department( String departmentName){
        this.departmentName = departmentName;
		this.employeesList = new ArrayList<Employee>();
		//this.managerOfDepartment = new Manager();
    }
    
    public boolean addEmployee(Employee employee){
    	for(Employee e : employeesList){
			if((e.surname.equals(employee.surname)) & (e.name.equals(employee.name)) & (e.patronymic.equals(employee.patronymic))){
				System.out.println("Такой  сотрудник  уже работает");
				return false;
			}
    	}
    	employeesList.add(employee);
		return true;
    	
    }
}


