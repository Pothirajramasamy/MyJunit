import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the container price :");
		int contPrice = Integer.parseInt(br.readLine());
		System.out.println("Enter the number of items in the container :");
		int noOfItem = Integer.parseInt(br.readLine());
		System.out.println("The average price of the item is Rs." + new ShipmentBO().calculateAveragePrice(contPrice, noOfItem));
	}

}