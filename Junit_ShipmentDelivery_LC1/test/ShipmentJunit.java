

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ShipmentJunit {
	
	ShipmentBO shipmentBO;
	
	
	@Before
	public void init() 
	{
		shipmentBO = new ShipmentBO();
	}
	
	
	@Test
	public void testDeliveredOnTime() throws ParseException 
	{
		
		assertEquals("Delivered on time",shipmentBO.findDeliveryType("01-01-2018", "01-01-2018"));
		assertEquals("Delivered on time",shipmentBO.findDeliveryType("07-08-2018", "07-08-2018"));
		assertEquals("Delivered on time",shipmentBO.findDeliveryType("09-09-2018", "09-09-2018"));
		
		
	}
	
	@Test
	public void testDeliveredOnDelay() throws ParseException 
	{
		assertEquals("Delayed",shipmentBO.findDeliveryType("01-01-2018", "02-01-2018"));
		assertEquals("Delayed",shipmentBO.findDeliveryType("07-08-2018", "08-08-2018"));
		assertEquals("Delayed",shipmentBO.findDeliveryType("09-09-2018", "25-09-2018"));
	}
	
	@Test
	public void testDeliveredInAdvance() throws ParseException 
	{
		assertEquals("Delivered in advance",shipmentBO.findDeliveryType("03-01-2018", "01-01-2018"));
		assertEquals("Delivered in advance",shipmentBO.findDeliveryType("07-08-2018", "01-08-2018"));
		assertEquals("Delivered in advance",shipmentBO.findDeliveryType("25-09-2018", "09-09-2018"));
		
	}
	
	@Test
	public void testOutOfDateDelivery() throws ParseException
	{
		//fill the code
	}
	
    @After
	public void destroy() {
		//fill the code
	}
}
