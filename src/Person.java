
public class Person {

	public String name;
	public String gender;
	public int age;
	public boolean lovesProgramming;

	// public = access modifier
	// void = return type
	// lopen = method name
	// () = arguments voor lopen
	// {} = code block

	public void printAge() {
		System.out.println(name + " is " + age + " years old");
	}

	public void printProgrammingCheck() {
		final String likesToProgram;

		if (lovesProgramming == true) {
			likesToProgram = "likes";
		} else {
			likesToProgram = "dislikes";
		}
		System.out.println(name + " " + likesToProgram + " programming");
	}

	public int whatIsYourAge() {
		return age;
	}

	public String whatIsYourName() {
		return name;
	}

	public String lopen(String state) {
		if (state != "walking") {
			System.out.println(name + " gaat lopen");
			return "walking";
		} else {
			System.out.println(name + " stopt met lopen");
			return "idle";
		}
	}

	public void zwaaien(int amount) {
		System.out.println("Wij gaan zo veel keer " + amount + " zwaaien");
	}

	public void setProperties(int _age, String _gender, String _name, boolean _lovesProgramming) {
		age = _age;
		gender = _gender;
		name = _name;
		lovesProgramming = _lovesProgramming;

	}

}
