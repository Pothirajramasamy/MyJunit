import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Main {
	public static void main(String args[]) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String acDate, ExDate;
		System.out.println("Expected Date shipment");
		ExDate = br.readLine();
		System.out.println("Actual Date shipment");
		acDate = br.readLine();
		System.out.println(new ShipmentBO().findDeliveryType(ExDate, acDate));
	}

}