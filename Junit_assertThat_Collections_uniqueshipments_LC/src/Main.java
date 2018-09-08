import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> shipmentId = new ArrayList<String>();
		System.out.println("Enter the number of shipment id :");
		int n = Integer.parseInt(buff.readLine());
		System.out.println("Enter the shipment id :");
		for(int i=0;i<n;i++) {
			shipmentId.add(buff.readLine());
		}
		System.out.println("Enter the shipment code :");
		String shipment = buff.readLine();
		HashSet<String> filter = new ShipmentBO().findShipmentByCode(shipmentId,shipment);
		System.out.println("Shipment id without duplicate values for code "+shipment+" :");
		Iterator<String> itr = filter.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}