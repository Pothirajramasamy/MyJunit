import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CustomerBO {
	public List<Customer> findFrequentCustomers(List<Commodity> cList){
		Map<String,Integer> m = new HashMap<String,Integer>();
		Map<String,Customer> objMap = new HashMap<String,Customer>();
		for(Commodity c:cList){
			if(m.get(c.getCommodityIdentification().getCustomer().getEmail())==null){
				m.put(c.getCommodityIdentification().getCustomer().getEmail(), 1);
			}
			else{
				m.put(c.getCommodityIdentification().getCustomer().getEmail(), m.get(c.getCommodityIdentification().getCustomer().getEmail())+1);
			}
			objMap.put(c.getCommodityIdentification().getCustomer().getEmail(), c.getCommodityIdentification().getCustomer());
		}
		List<Customer> c = new ArrayList<>();
		for(Entry<String, Integer> q:m.entrySet()){
			if(q.getValue()>=3){
				c.add(objMap.get(q.getKey()));
			}
		}
		return c;
		
	}
}
