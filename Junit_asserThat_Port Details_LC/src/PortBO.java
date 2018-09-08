
import java.util.*;

public class PortBO {

	public void addElementAtSpecfiedPosition(List<Port> port,int pos,String detail) 
	{
		String details[] = detail.split(",");
		int d=pos-1;
		port.add(d,new Port(Integer.parseInt(details[0]),details[1],details[2]));
	}
	
}
