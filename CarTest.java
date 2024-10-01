package assignments_30;

public class CarTest {

	public static void main(String[] args) {

		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car1.accept("Model S", "Tesla", 79999.99, "pratima");

		car2.accept("Civic", "innova", 22000.00, "priya");

		car3.accept("Corolla", "Toyota", 20000.00, "mayuri");

		System.out.println("Car 1 Details:");
		car1.display();

		System.out.println("Car 2 Details:");
		car2.display();

		System.out.println("Car 3 Details:");
		car3.display();

	}

}
