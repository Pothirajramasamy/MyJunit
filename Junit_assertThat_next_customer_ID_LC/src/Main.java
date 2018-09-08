import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		Integer n = Integer.parseInt(buf.readLine());
		Integer[] customerId = new Integer[n];
		for (int i = 0; i < n; i++) {
			customerId[i] = Integer.parseInt(buf.readLine());
		}

		CustomerBO customer = new CustomerBO();
		Integer max = customer.findNextCustomerId(n, customerId);
		System.out.println("Next customer id is " + (max + 1));
	}
}