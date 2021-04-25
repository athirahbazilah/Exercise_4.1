package ExerciseInheritance;

public class Apple extends Fruit {
	
	protected int quantity;
	protected int price;
	
	public Apple(String name, int q, int p) {
		super(name);
		this.quantity = q;
		this.price = p;
		
		System.out.println("Apple Constructor is Invoked");
	}
	
	public int TotalPrice() {
		return this.quantity * this.price;
	}

}
