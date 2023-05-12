import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Person p1; // Declaration
		Person p2;

		p1 = new Person(); // Assignment
		p2 = new Person();

		// Person a = new Person(); // Initialisation
		// Person b = new Person();

		p1.name = "Ian";
		p1.age = 25;
		p1.gender = "male";
		p1.lovesProgramming = false;

		p2.name = "Brian";
		p2.age = 23;
		p2.gender = "male";
		p2.lovesProgramming = true;

		String state = "walking";

		System.out.println("Naam van persoon 1 is " + p1.name);
		System.out.println("Naam van persoon 2 is " + p2.name);

		p1.printAge();
		p1.printProgrammingCheck();

		state = p1.lopen(state);
		System.out.println("State = " + state);

		int age = p1.whatIsYourAge();
		System.out.println("Age = " + age);

		String name = p1.whatIsYourName();
		System.out.println("name = " + name);

		p1.zwaaien(5);

		p1.setProperties(22, "female", "Bloeme", false);

		System.out.println(p1.name + " is " + p1.age + " years old and is " + p1.gender);
		
		Vervoermiddel v = new Vervoermiddel("Toyota",30);
		Vervoermiddel p = new Vervoermiddel(30);
		
		// -------------- Applicatie
		
		Scanner scanner = new Scanner(System.in);	
		System.out.println("What should the car be called?");
		String iName = scanner.nextLine();
		System.out.println("What is the car's speed?");
		int iSpeed = scanner.nextInt(); scanner.nextLine();
		
		Vervoermiddel s = new Vervoermiddel(iName, iSpeed);
		
		v.setName(iName);
		v.setSpeed(iSpeed);
		
		v.printProperties();
	}

}
