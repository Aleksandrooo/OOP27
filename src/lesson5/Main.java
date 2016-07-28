package lesson5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		person1.age = 20;
		person1.name = "Vasia";
		
		Person person2 = new Person();
		person2.age = 40;
		person2.name = "Petro";
		
		//printPerson (person1);
		
		person1.print();
		person2.print();
		person1.foo = 20;
		
		Person.foo = 30;
		
		
	}
	
	public static void printPerson (Person p){
		System.out.println(p.age + " -- " + p.name);
	}

}
