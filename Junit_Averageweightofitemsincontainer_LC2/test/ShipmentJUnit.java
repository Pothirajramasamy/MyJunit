
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShipmentJUnit {
	double delta = 0.01;
	ShipmentBO shipment;

	@Before
	public void setup()
	{
		shipment = new ShipmentBO();
	}


	@Test
	public void testCalculateAverage() 
	{
		
	assertNotNull(shipment);
	
	delta = 1.00;
	assertEquals(delta,shipment.calculateAverage(1,1.0,1,1.0),0);
	
	delta = 10.00;
	assertEquals(delta,shipment.calculateAverage(1,10.0,1,10.0),0);
	
	delta = 11.954545454545455;
	assertEquals(delta,shipment.calculateAverage(10,12.5,12,11.5),0);
	
	delta = 0.0;
	assertEquals(delta,shipment.calculateAverage(0,0,0,0),0);
	
	delta = 1.0;
	assertEquals(delta,shipment.calculateAverage(0,0,1,1.0),0);
	}
	

	@After
	public void tearDown()
	{
		shipment = null;
	}
}
