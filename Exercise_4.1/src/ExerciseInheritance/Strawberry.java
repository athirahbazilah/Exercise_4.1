package ExerciseInheritance;

public class Strawberry extends Fruit {
	
	private String colour;
	private int weight;
	
	public Strawberry(String name, String C, int W) {
		super(name);
		this.colour = C;
		this.weight = W;
		
		System.out.println("Strawberry Constructor is Invoked");
		
	}
	
	public String Colour() {
		return this.colour;
	}
	
	public int Weight() {
		return this.weight;
	}

}
