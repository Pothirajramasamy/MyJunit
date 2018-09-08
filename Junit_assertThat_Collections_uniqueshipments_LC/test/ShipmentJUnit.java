import java.util.ArrayList;
import java.util.HashSet;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ShipmentJUnit {
	
	ArrayList<String> shipmentId;
	ShipmentBO shipmentBO;
	String s = null;
	HashSet<String> a;
	
	@Before
	public void createObjectForShipmentBO() {
		shipmentBO = new ShipmentBO();
		shipmentId = new ArrayList<String>();
	
	}
	
	
	@Test
	public void testUniqueShipmentByCode() {
		
		shipmentId.add("BLUDR65");
		shipmentId.add("FEDX32");
		shipmentId.add("HALD90");
		shipmentId.add("FEDX87");
		shipmentId.add("BLUDR90");
		s = "BLUDR";
		
		a = shipmentBO.findShipmentByCode(shipmentId, s);
		
		assertThat(a,  containsInAnyOrder("BLUDR65","BLUDR90"  ) );
		//assertThat(a, contains("BLUDR90" ) );
		
	}
}
