package lesson7;

/**
 * Created by Admin on 11.08.2016.
 */
public class SalesManager extends Employee{

    int selling;

    public SalesManager(String name, String surname, int salarySum, long personalCardAccount, String gender, String department, int selling) {
        super(name, surname, salarySum, personalCardAccount, gender, department);
        
        this.selling = selling;
    }
}
