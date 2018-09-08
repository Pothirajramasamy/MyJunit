
import java.util.*;

public class ShipmentEntityBO {

	public void addShipmentEntityToList(List<ShipmentEntity> shipmentEntityList, String shipmentDetails) {
		String splited[] = shipmentDetails.split(",");

		shipmentEntityList.add(
				new ShipmentEntity(new Integer(splited[0]), splited[1], splited[2], new Long(splited[3]), splited[4]));

	}

}