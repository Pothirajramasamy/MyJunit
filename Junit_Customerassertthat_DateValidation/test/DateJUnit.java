import static org.hamcrest.MatcherAssert.assertThat;

import java.text.ParseException;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Before;
import org.junit.Test;

public class DateJUnit {
	DateValidationBO dateValidationBO;

	@Before
	public void createObjectForDateValidationBO() {
		dateValidationBO = new DateValidationBO();
	}

	@Test
	public void testFindValidDate() throws ParseException {
		assertThat(dateValidationBO.findValidDate("03/27/2016"), DateChecker.checkDate("27/03/2016"));
		assertThat(dateValidationBO.findValidDate("11/25/2017"), DateChecker.checkDate("25/11/2017"));
		assertThat(dateValidationBO.findValidDate("12/24/2016"), DateChecker.checkDate("24/12/2016"));
	}
}

class DateChecker {
	public static Matcher<String> checkDate(final String actual) {
		return new TypeSafeMatcher<String>() {

			@Override
			public void describeTo(final Description description) {
				try {
					description.appendText("Date is <").appendText(   new DateValidationBO().findValidDate(actual).toString()).appendText(">");
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}

			@Override
			protected boolean matchesSafely(final String value) {
				return actual.equals(value);
			}

			@Override
			public final void describeMismatchSafely(final String date, final Description mismatchDescription) {
				mismatchDescription.appendText("the actual date was <").appendText(actual.toString()).appendText(">");
			}
		};
	}
}