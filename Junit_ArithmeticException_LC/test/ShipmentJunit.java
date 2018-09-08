import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class ShipmentJunit {
	ShipmentBO shipmentBO;
	
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	
	@Before
	public void init() {
		shipmentBO = new ShipmentBO();
	}
	
	@Test
	public void testCalculatAverageWithoutZero(){

		assertEquals ( 5.0, shipmentBO.calculateAveragePrice(10, 2), 0);	
	}

	@Test
	public void testCalculateAverageWithZero()  throws ArithmeticException {
		
		thrown.expect(ArithmeticException.class);
		assertEquals ( 5, shipmentBO.calculateAveragePrice(10, 0), 0);	
	}
	
	@After
	public void destroy() {
		shipmentBO = null;
	}
}
