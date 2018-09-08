
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class RoleJUnit 
{
	RoleBO RB;
	@Before
	public void statrup()
	{
	RB = new RoleBO();

	}
	
	
	@Test
	public void testFindRoleWithMaxPrivilege()
	{
		Role[] role  = new Role[5];	
		Privilege[] p = new Privilege[] {new Privilege("Admin") , new Privilege("Guide the team") ,new Privilege("Supporting the team")}; 
		role[0] = new Role("Technical support" , p );	
		Privilege[] q = new Privilege[] {new Privilege("Admin") , new Privilege("Edit Database") }; 
		role[1] = new Role("Administrator" , q );	
		Privilege[] r = new Privilege[] {new Privilege("Admin") , new Privilege("Data Analyse") , new Privilege("Data Pulling") }; 
		role[2] = new Role("Systems analyst" , r );
		Privilege[] s = new Privilege[] {new Privilege("System Admin") , new Privilege("Admin") }; 
		role[3] = new Role("Network engineer" , s );
		Privilege[] t = new Privilege[] {new Privilege("Marketing")}; 
		role[4] = new Role("Business analyst" , t );
		
		System.out.println(RB.findRoleWithMaxPrivilege(role).length);
		
		Role[] rol = new Role [RB.findRoleWithMaxPrivilege(role).length];
		rol = RB.findRoleWithMaxPrivilege(role);

		System.out.println(rol[0].getName());
		System.out.println(rol[1].getName());
		
		assertEquals("Systems analyst", rol[0].getName());
		assertEquals("Technical support", rol[1].getName());
	}
	
	
	@After
	public void dropp()
	{
		
	}
	

}
