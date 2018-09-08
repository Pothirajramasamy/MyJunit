import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import org.junit.After;

public class RoleJUnit {
	RoleBO roleBO;
	Role[] role = new Role[3];
	User u = new User();
	
	@Before()	
	public void createObjectForRoleBO() {
		roleBO = new RoleBO();
		role[0] = new Role(10,"Agent");
		role[1] = new Role(20,"Customer");
		role[2] = new Role(30,"Shipper");
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	
	@Test
	public void testIsRolePresent() throws InvalidRoleException {
		
		thrown.expect(InvalidRoleException.class);
		assertTrue(roleBO.isRolePresent(10,"Agent", 0) instanceof User);
		assertTrue(roleBO.isRolePresent(20,"Customer", 10) instanceof User);
		assertTrue(roleBO.isRolePresent(30,"Shipper", 20) instanceof User);
	}
	
	@Test
	public void testIsRolePresent_Exception() {
		try {
			assertTrue(roleBO.isRolePresent(10,"Agent" , 10)  instanceof User);
			assertTrue(roleBO.isRolePresent(20,"Customer", 20) instanceof User);
			assertTrue(roleBO.isRolePresent(30,"Shipper", 30) instanceof User);
		} catch (InvalidRoleException e) {
			e.printStackTrace();
		}
	}
	
	
	@After
	public void destroy()
	{
		
	}
	
	
}