
public class Vervoermiddel {

	private String name;
	private int speed;

	public Vervoermiddel(String name, int speed) {
		System.out.println("In vervoermiddel constructor");
		this.name = name;
		this.speed = speed;
		System.out.println(name + " is de naam van mijn auto en hij is " + speed + " snel");
	}

	public Vervoermiddel(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed >= 0)
			this.speed = speed;
	}
	
	public void printProperties() {
		System.out.println(name + " is de naam van mijn auto en hij is " + speed + " snel");
	}
}
