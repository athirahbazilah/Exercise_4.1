package ExerciseInheritance;

public class GreenApple extends Apple {
	
	private String taste;
	private int protein;
	
	public GreenApple(String name, int q, int p, String t, int pr) {
		super(name, q, p);
		this.taste = t;
		this.protein = pr;
		
		System.out.println("Green Apple Constructor is Invoked");
		
	}
	
	public String Taste() {
		return this.taste;
	}
	
	public int TotalProtein() {
		return this.quantity * this.protein;
	}

}
