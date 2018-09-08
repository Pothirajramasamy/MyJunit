import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		ShipmentEntityBO shipmentEntityBO = new ShipmentEntityBO();
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of shipment entity :");
		Integer n = Integer.parseInt(buff.readLine());
		ArrayList<ShipmentEntity> list = new ArrayList<ShipmentEntity>();
		System.out.println("Enter Shipment entity details :");
		for (int i = 0; i < n; i++) {
			String shipmentDetails = buff.readLine();
			shipmentEntityBO.addShipmentEntityToList(list, shipmentDetails);
		}

		System.out.format("Shipment entity details :\n%-15s %-15s %-15s %-15s %s\n", "ID", "Name", "Account Number",
				"Credit Limit", "Address");
		for (ShipmentEntity s : list)
			System.out.format("%-15s %-15s %-15s %-15s %s\n", s.getId(), s.getName(), s.getAccountNumber(),
					s.getCreditLimit(), s.getAddress());

	}
}