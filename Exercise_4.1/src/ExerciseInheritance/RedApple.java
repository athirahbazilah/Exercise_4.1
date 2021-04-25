package ExerciseInheritance;

public class RedApple extends Apple {
	
	private String taste;
	private int calories;
	
	public RedApple(String name, int q, int p, String t, int c) {
		super(name, q, p);
		this.taste = t;
		this.calories = c;
		
		System.out.println("Red Apple Constructor is Invoked");
		
	}
	
	public String taste() {
		return this.taste;
	}
	
	public int TotalCalories() {
		return this.calories * this.quantity;
	}

}
