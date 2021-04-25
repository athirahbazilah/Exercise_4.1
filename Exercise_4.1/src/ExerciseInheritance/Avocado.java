package ExerciseInheritance;

public class Avocado  extends Apple {
	
	private int rotten;
	
	public Avocado(String name, int q, int p, int r) {
		super (name, q, p);
		this.rotten = r;
		
		System.out.println("Avocado Constructor is Invoked");
	}
	
	public int TotalGood() {
		return this.quantity - this.rotten;
	}

}
