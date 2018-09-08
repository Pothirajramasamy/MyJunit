import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PortJUnit {
	
	List<Port> port = new ArrayList<Port>();
	PortBO PB = new PortBO();
	
	@Before
	public void createObjectForPort()
	{
		port.add(new Port(101, " Gandhi" , " Chennai"));
		port.add(new Port(102, " Mahatma" , " Delhi"));
		port.add(new Port(103, " Gujili" , " Bangalore"));
	}
	
	@Test
	public void testPortDetails()
	{	
	
		PB.addElementAtSpecfiedPosition(port, 4, "104,merlin,kerala"  );		
		assertThat(port, hasSize( 4 ));

	}
}
