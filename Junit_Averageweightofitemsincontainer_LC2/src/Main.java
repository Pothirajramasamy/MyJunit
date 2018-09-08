import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n1");
		int n1 = s.nextInt();
		System.out.println("Enter the weight of n1");
		double wt1 = s.nextDouble();
		System.out.println("Enter n2");
		int n2 = s.nextInt();
		System.out.println("Enter the weight of n2");
		double wt2 = s.nextDouble();

		ShipmentBO shipmentBO = new ShipmentBO();
		double average = shipmentBO.calculateAverage(n1, wt1, n2, wt2);
		System.out.printf("Average weight : %.2f", average);
	}

}
