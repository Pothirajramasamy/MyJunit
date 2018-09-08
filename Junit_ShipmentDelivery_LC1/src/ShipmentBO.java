import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ShipmentBO {
	
	public String findDeliveryType(String expectedDate,String actualDate) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		if (formatter.parse(expectedDate).compareTo(formatter.parse(actualDate)) > 0) {
			return "Delivered in advance";
		} else if (formatter.parse(expectedDate).compareTo(formatter.parse(actualDate)) < 0) {
			return "Delayed";
		} else {
			return "Delivered on time";
		}
	}
}
