import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Junit {

	List<ShipmentEntity> se;
	ShipmentEntityBO sbo;

	@Before
	public void createObjectForShipmentEntity() {
		se = new ArrayList<ShipmentEntity>();
		sbo = new ShipmentEntityBO();
	}

	@Test
	public void testListofShipmentEntity() {

		sbo.addShipmentEntityToList(se, "103,Mike Hastings,3514537165,540000300,Sydney");
		sbo.addShipmentEntityToList(se, "101,Chris Romz,5987413568,8500000,New York");

		List<Integer> id = new ArrayList<Integer>();
		List<String> name = new ArrayList<String>();
		List<String> accountNumber = new ArrayList<String>();
		List<Long> creditLimit = new ArrayList<Long>();
		List<String> address = new ArrayList<String>();

		for (ShipmentEntity a : se) {
			id.add(a.getId());
			name.add(a.getName());
			accountNumber.add(a.getAccountNumber());
			creditLimit.add(a.getCreditLimit());
			address.add(a.getAddress());

		}

		assertThat(id, containsInAnyOrder(103, 101));
		assertThat(name, containsInAnyOrder("Mike Hastings", "Chris Romz"));
		assertThat(accountNumber, containsInAnyOrder("3514537165", "5987413568"));
		assertThat(creditLimit, containsInAnyOrder(540000300L, 8500000L));
		assertThat(address, containsInAnyOrder("Sydney", "New York"));

	}
}
