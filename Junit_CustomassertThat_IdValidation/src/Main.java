import java.io.*;
public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the invoice code");
		String str1;
		str1 = br.readLine();
		System.out.println("Formated Code :");
		System.out.println(new InvoiceBO().generateInvoiceId(str1));
	}

}
