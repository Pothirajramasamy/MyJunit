import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateValidationBO {
	public String findValidDate(String date) throws ParseException {
		SimpleDateFormat dmy = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat mdy = new SimpleDateFormat("MM/dd/yyyy");
		Date dat = mdy.parse(date);
		return dmy.format(dat);
	}
}
