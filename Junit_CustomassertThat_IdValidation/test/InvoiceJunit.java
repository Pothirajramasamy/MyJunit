import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InvoiceJunit {

	InvoiceBO invoiceBO;

	
	@Before
	public void init() {
		invoiceBO = new InvoiceBO();
	}
	
	
	@Test
	public void testGeneratedInvoiceId() {

		assertThat(invoiceBO.generateInvoiceId("CU1"), CheckInvoiceId.checkInvoiceId("CUR00001"));
		assertThat(invoiceBO.generateInvoiceId("CU01"), CheckInvoiceId.checkInvoiceId("CUR00001"));
		assertThat(invoiceBO.generateInvoiceId("CU001"), CheckInvoiceId.checkInvoiceId("CUR00001"));
		assertThat(invoiceBO.generateInvoiceId("CU0001"), CheckInvoiceId.checkInvoiceId("CUR00001"));
		assertThat(invoiceBO.generateInvoiceId("CU00001"), CheckInvoiceId.checkInvoiceId("CUR00001"));

		assertThat(invoiceBO.generateInvoiceId("AT2"), CheckInvoiceId.checkInvoiceId("AGT00002"));
		assertThat(invoiceBO.generateInvoiceId("AT02"), CheckInvoiceId.checkInvoiceId("AGT00002"));
		assertThat(invoiceBO.generateInvoiceId("AT002"), CheckInvoiceId.checkInvoiceId("AGT00002"));
		assertThat(invoiceBO.generateInvoiceId("AT0002"), CheckInvoiceId.checkInvoiceId("AGT00002"));
		assertThat(invoiceBO.generateInvoiceId("AT00002"), CheckInvoiceId.checkInvoiceId("AGT00002"));

		assertThat(invoiceBO.generateInvoiceId("CY9"), CheckInvoiceId.checkInvoiceId("CMY00009"));
		assertThat(invoiceBO.generateInvoiceId("CY09"), CheckInvoiceId.checkInvoiceId("CMY00009"));
		assertThat(invoiceBO.generateInvoiceId("CY009"), CheckInvoiceId.checkInvoiceId("CMY00009"));
		assertThat(invoiceBO.generateInvoiceId("CY0009"), CheckInvoiceId.checkInvoiceId("CMY00009"));
		assertThat(invoiceBO.generateInvoiceId("CY00009"), CheckInvoiceId.checkInvoiceId("CMY00009"));
	}
	
	
	@After
	public void destroy() {
		invoiceBO = null;
	}
}

class CheckInvoiceId {
	
	public static Matcher<String> checkInvoiceId(final String actual) {
		return new TypeSafeMatcher<String>() {

			@Override
			public void describeTo(Description description) {
				throw new AssertionError("Invalid Format");
				
			}

			@Override
			protected boolean matchesSafely(String item) {
				return actual.equals(item);
			}
			
			
		};
	}
}
