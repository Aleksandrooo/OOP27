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

        firm1.addDepartment(new Department ("dev"));
        firm1.addDepartment(new Department ("QA"));
        firm1.addDepartment(new Department ("BA"));
        firm1.printFirm();

    }
}
