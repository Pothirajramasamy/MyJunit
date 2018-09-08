import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShipmentJUnit 
{
	ShipmentBO SB;
	
	@Before
	public void setup()
	{
		SB = new ShipmentBO();
		
	}
	
	@Test
	public void testFindOneModes()
	{
		String[] a1 = new String[]{"1|Hyd|1|0|0","2|Mumbai|1|1|0","3|Chennai|1|1|1"};
		String[] a2 = new String[]{"1|Hyd|1|0|0","2|Mumbai|0|1|0","3|Chennai|0|0|1"};
		assertArrayEquals(new String[]{"Hyd",null,null}, SB.findOneModes(a1.length, a1));
		assertArrayEquals(new String[]{"Hyd","Mumbai","Chennai"},SB.findOneModes(a2.length,a2));
	}
		

	
	@Test
	public void testFindMultipleModes()
	{
		String[] b1 = new String[]{"1|Hyd|0|1|1","2|Mumbai|1|1|0","3|Chennai|1|1|1", "4|Cochin|1|0|1"};
		String[] b2 = new String[]{"1|Hyd|1|0|0","2|Mumbai|0|1|0","3|Chennai|0|0|1"};
		assertArrayEquals(new String[]{"Hyd","Mumbai","Chennai", "Cochin"},SB.findMultipleModes(b1.length, b1));
		assertArrayEquals(new String[]{null, null, null}, SB.findMultipleModes(b2.length, b2));
		
	}
	
	@After
	public void destroy()
	{
		
	}
	
	
	
	}
