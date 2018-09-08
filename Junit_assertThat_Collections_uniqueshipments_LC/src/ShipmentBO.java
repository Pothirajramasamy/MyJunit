import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class ShipmentBO {
	public HashSet<String> findShipmentByCode(ArrayList<String> shipmentId,String shipment) {
		HashSet<String> unique = new HashSet<String>(shipmentId);
		HashSet<String> filter = new HashSet<String>();
		Iterator<String> itr = unique.iterator();
		int length = shipment.length();
		while(itr.hasNext()) {
			String val = itr.next();
			if(shipment.equalsIgnoreCase(val.substring(0, length))) {
				filter.add(val);
			}
		}
		return filter;
	}
}