package lesson7;


//import lesson7.Number;

import java.util.Scanner;

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

        Employee emp = new Employee("Petrenko", "Sasha", "Andreevich", 2000, 0, "male", dev);

        firm1.addEmployee(emp);
        firm1.addEmployee(new Employee("Petrenchuk", "Sasha", "Andreevich", 2200, 0, "male", dev));
        firm1.addEmployee(new Employee("Petrenko", "Anna", "Andreevna", 1800, 0, "female", dev));
//        firm1.addManager(new Employee("Alexeychenko", "Alex", "Alexovich", 3200, 0, "male", dev));
//        firm1.addSallesManager(new Employee("Sahno", "Alla", "Andreevna", 2100, 0, "female", dev));

        firm1.fireEmployee("Petrenkoва", "Anna", "Andreevna");
        firm1.fireEmployee("Petrenchuk", "Sasha", "Andreevich");


        menu(firm1);
        firm1.printFirm();

    }

    public  static void menu(Firm firm1) {
        int i =0;
        while (i != 10){
            Scanner scan = new Scanner(System.in);

            System.out.println("Введите номер меню ");
            System.out.println("1. Добавить новый  отдел");
            System.out.println("2. Добавить нового  сотрудника");
            System.out.println("3. Добавить удалить сотрудкника");
            System.out.println("4. Перевети сотрудкника в другой отдел");
            System.out.println("5. Выдать всем зарплату");
            System.out.println("6. Получить список всех сотрудников");
            System.out.println("10. Выход");

            System.out.print("Введите целое число: ");
            if(scan.hasNextInt()) {
                i = scan.nextInt();
                switch (i){
                    case 1:
                        addNewDepartment(firm1);
                        break;
                    case 10:
                        i=10;
                        break;
                }

            } else {
                System.out.println("Вы ввели не целое число");
            }
        }


    }

    private static void addNewDepartment(Firm firm1) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите название отдела:");
        String str;
        if(scan.hasNextLine()) {
            str = scan.nextLine();
            firm1.addDepartment(new Department (str));
        }

    }
}
