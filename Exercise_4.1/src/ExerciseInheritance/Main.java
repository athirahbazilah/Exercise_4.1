package ExerciseInheritance;

public class Main {

	public static void main(String[] args) {
		
		Fruit objFruit = new Fruit("Fruit");
		System.out.println();
		
		Apple objApple = new Apple("Apple", 7, 6);
		System.out.println("Total Price: RM " + objApple.TotalPrice());
		System.out.println();
		
		Avocado objAvo = new Avocado("Avocado", 10, 5, 3);
		System.out.println("Total Price: RM " + objAvo.TotalPrice());
		System.out.println("Total Good: " + objAvo.TotalGood());
		System.out.println();
		
		Strawberry objStraw = new Strawberry("Strawberry", "Red", 12);
		System.out.println("Colour: " + objStraw.Colour());
		System.out.println("Weight: " + objStraw.Weight() + " g");
		System.out.println();
		
		RedApple objRed = new RedApple("Red Apple", 15, 2, "Sweet", 95);
		System.out.println("Total Price: RM " + objRed.TotalPrice());
		System.out.println("Taste: " + objRed.taste());
		System.out.println("Total Calories: " + objRed.TotalCalories());
		System.out.println();
		
		GreenApple objGreen = new GreenApple("Green Apple", 20, 4, "Sour", 1);
		System.out.println("Total Price: RM " + objGreen.TotalPrice());
		System.out.println("Taste: " + objGreen.Taste());
		System.out.println("Total Protein: " + objGreen.TotalProtein() + " g");

	}

}
