import java.io.*;
import java.util.*;
public class Main {
 public static void main(String args[]) throws IOException{
 PortBO portBO = new PortBO();
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
     ArrayList<Port> port = new ArrayList<Port>();

     System.out.println("Enter the number of port details");
     Integer noOfPort = Integer.parseInt(br.readLine());
     int i,pos;String portDetail;
     Port port1;
     System.out.println("Enter the port details");
     
     for(i=0;i<noOfPort;i++){ 
        portDetail = br.readLine();
        String portDetails[] = portDetail.split(",");
        port1 = new Port(Integer.parseInt(portDetails[0]),portDetails[1],portDetails[2]);
      port.add(port1);
     
     }
     
   System.out.format("%-15s %-15s %-15s\n","Port Id","Name","Location"); 
     
  for (Port portIns: port) {
     System.out.println(portIns);
  }
    
   System.out.println("Enter the position");
   pos = Integer.parseInt(br.readLine());
   
   System.out.println("Enter port detail to be inserted");
   String detail = br.readLine();
   
    portBO.addElementAtSpecfiedPosition(port, pos, detail);
   
   System.out.println("After the insertion of port details");
   System.out.format("%-15s %-15s %-15s\n","Port Id","Name","Location"); 
     
   for (Port portIns: port) {
     System.out.println(portIns);
   }
     
     
 }
}