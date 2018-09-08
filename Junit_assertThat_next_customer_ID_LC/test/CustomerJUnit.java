import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomerJUnit {
	
	CustomerBO customer;

	@Before
	public void setUp() {
		customer = new CustomerBO();
	}

	@Test
	public void testFindNextCustomerId() {
		
		Integer[] intarr = new Integer[] { 4 , 5};
		assertThat( 5 , is(customer.findNextCustomerId (2, intarr)) ) ;	
		
		Integer[] intarr2 = new Integer[] { 4 , 5  , 6 , 7 ,  8};
		assertThat( 8 , is(customer.findNextCustomerId (5, intarr2)) ) ;
	}
	
	@After
	public void destroy()
	{
		
	}
	
	
	
	}

