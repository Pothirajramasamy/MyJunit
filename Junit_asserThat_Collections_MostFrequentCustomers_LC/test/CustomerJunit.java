import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CustomerJunit {

	List<Commodity> cList ;
	CustomerBO cb;
	List<Customer> li;
	
	@Before
	public void init() {
		cb = new CustomerBO();
				
	}

	@Test
	public void testFrequentCustomers() {
		 cList = new ArrayList<Commodity>();
		 cList.add( new Commodity (Double.parseDouble("100"), Double.parseDouble("2"), (new CommodityIdentification( "This is first customer" , "Sony Bravo", "ABC123", (new Customer("name", "name@gmail.com") )) )));
		 cList.add( new Commodity (Double.parseDouble("101"), Double.parseDouble("3"), (new CommodityIdentification( "This is Second customer" , "LG", "ABC456", (new Customer("name", "name@gmail.com") )) )));
		 cList.add( new Commodity (Double.parseDouble("101"), Double.parseDouble("3"), (new CommodityIdentification( "This is Second customer" , "LG", "ABC456", (new Customer("name", "name@gmail.com") )) )));
		 cList.add( new Commodity (Double.parseDouble("101"), Double.parseDouble("3"), (new CommodityIdentification( "This is Second customer" , "LG", "ABC456", (new Customer("name", "name@gmail.com") )) )));
		 cList.add( new Commodity (Double.parseDouble("101"), Double.parseDouble("3"), (new CommodityIdentification( "This is Second customer" , "LG", "ABC456", (new Customer("name", "name@gmail.com") )) )));

		 
		 li = cb.findFrequentCustomers(cList);
		 	 
		 List<String> details = new ArrayList<String>();
		 
		 for(Customer a : li)
		 {
			 details.add(a.getName());
		 }
		 
		 assertThat(details, containsInAnyOrder("Raj"));
	}
	
	
	public void destroy() {
		
	}

}
