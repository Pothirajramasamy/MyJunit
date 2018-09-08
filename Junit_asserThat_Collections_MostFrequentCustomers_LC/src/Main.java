import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException,ParseException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of shipments");
		int n = Integer.parseInt(br.readLine());
		String str,arr[];
		List<Commodity> cList = new ArrayList<Commodity>();
		Customer c;
		CommodityIdentification ci;
		Commodity co;
		for(int i=0;i<n;i++){
			str = br.readLine();
			arr = str.split(",");
			c = new Customer(arr[0], arr[1]);
			ci = new CommodityIdentification(arr[2], arr[3], arr[4], c);
			co = new Commodity(Double.parseDouble(arr[5]), Double.parseDouble(arr[6]), ci);
			cList.add(co);
		}
		List<Customer> cq = new CustomerBO().findFrequentCustomers(cList);
		Collections.sort(cq);
		System.out.println("Frequent Customers are:");
		for(Customer cus:cq){
			System.out.println(cus.getName());
		}

	}
	
}
