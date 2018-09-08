import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShipmentJunit {
	
	ShipmentBO shipmentBO;
	
	
	@Before
	public void arrayy()
	{
		shipmentBO = new ShipmentBO();
	}

	
	
	@Test
	public void testLeftOutValue() 
	{
		//double a[] = new double[] {10.0,11.1,12.2,13.3,14.4,15.5};
		//assertEquals(10.0, shipmentBO.findLeftOutValue(a),0);
		
		//double c[] = new double[] {10.0,11.1,};
		//assertEquals(10.0, shipmentBO.findLeftOutValue(c),0);
		
		assertTrue(shipmentBO.findLeftOutValue(new double[] { 46.45, 23, 40, 68 }) == 23);
		assertTrue(shipmentBO.findLeftOutValue(new double[] { 46.45, 23 }) == 23);
		assertTrue(shipmentBO.findLeftOutValue(new double[] { 246.45, 823.43, 63.98, 67.45, 63.98 }) == 63.98);
		assertTrue(shipmentBO.findLeftOutValue(new double[] { 246.45 }) == 246.45);
		
		//double b[] = new double[] {555.5,111.11,122.23,133.34,144.4,156.5};
		//assertEquals(111.11, shipmentBO.findLeftOutValue(b),0);
		
		
	}
	
	@After
	public void destroy()
	{
		
	}
}
