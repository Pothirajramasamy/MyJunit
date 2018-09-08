import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
public class Main {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the date :");
		String date = buff.readLine();
		String d = new DateValidationBO().findValidDate(date);
		System.out.println("Correct date is :");
		System.out.println(d);
	}
}