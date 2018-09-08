

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RoundOffJUnit 
{
	RoundOffBO roundOffBO;
	
	@Before
	public void createObjectForRoundOffBO() 
	{
		roundOffBO = new RoundOffBO();
	}
	
	@Test
	public void testRoundOffValue() 
	{
		assertEquals("0",String.valueOf(roundOffBO.getRoundOffValue(0)));
		assertEquals("0",String.valueOf(roundOffBO.getRoundOffValue(2)));
		assertEquals("10",String.valueOf(roundOffBO.getRoundOffValue(5)));
		assertEquals("10",String.valueOf(roundOffBO.getRoundOffValue(7)));

	}
	
	@After
	public void destroy() 
	{
		//roundOffBO = null;
	}
	
	
}