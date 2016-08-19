package lesson7;


//import lesson7.Number;
/**
 * Created by Admin on 08.08.2016.
 */
public class Main {

    public static  void main(String[] args) {
//        Number number1 = new Number(5);
//        Number number2 = new Number(10);
//
//        Number res = number1.add(number2);

//        Firm f = new Firm("qqq", "wewewe", 0);
//
//
//
//        System.out.println(f);

        //consolMenu();
    	Firm firm1 = new Firm("SoftwareFirm", "Kyiv", 12000.0);
        Department dev  = new Department ("dev");

        firm1.addDepartment(dev);
        firm1.addDepartment(new Department ("QA"));
        firm1.addDepartment(new Department ("BA"));

        firm1.addEmployee(new Employee("Petrenko", "Sasha", "Andreevich", 2000, 0, "male", dev));
        firm1.addEmployee(new Employee("Petrenchuk", "Sasha", "Andreevich", 2200, 0, "male", dev));
        firm1.addEmployee(new Employee("Petrenko", "Anna", "Andreevna", 1800, 0, "female", dev));
//        firm1.addManager(new Employee("Alexeychenko", "Alex", "Alexovich", 3200, 0, "male", dev));
//        firm1.addSallesManager(new Employee("Sahno", "Alla", "Andreevna", 2100, 0, "female", dev));
        firm1.printFirm();

    }
}
