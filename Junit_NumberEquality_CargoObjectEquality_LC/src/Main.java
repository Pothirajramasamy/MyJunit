import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double a[] = new double[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextDouble();
		}
		System.out.println("The left out shipment value is : ");
		System.out.printf("%.2f", new ShipmentBO().findLeftOutValue(a));
		s.close();
	}
}