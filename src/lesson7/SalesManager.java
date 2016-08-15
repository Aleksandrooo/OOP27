package lesson7;

/**
 * Created by Admin on 11.08.2016.
 */
public class SalesManager extends Employee{

    int selling;

    public SalesManager(String surname, String name, String patronymic, int salarySum, long personalCardAccount, String gender, String department, int selling) {
        super(surname, name, patronymic, salarySum, personalCardAccount, gender, department);
        
        this.selling = selling;
    }
}
