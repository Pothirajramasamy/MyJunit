import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		int n, i;
		BufferedReader buffererReader = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Enter number of ports :");
		n = Integer.parseInt(buffererReader.readLine());
		String input[] = new String[n];
		System.out.println("Enter port details :");
		for (i = 0; i < n; i++)
			input[i] = buffererReader.readLine();

		ShipmentBO shipment = new ShipmentBO();
		shipment.findOneModes(n, input);
		shipment.findMultipleModes(n, input);
	}
}
