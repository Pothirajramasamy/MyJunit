
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        int n,i,j;
        String privilegeDetails,privilage[];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter number of role :");
        n = Integer.parseInt(br.readLine());
        Role role[] = new Role[n];
        
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the role "+(i+1)+" details :");
            role[i] = new Role();
            System.out.println("Enter role name :");
            role[i].setName(br.readLine()) ;
            System.out.println("Enter the privileges :");
            privilegeDetails = br.readLine();
            privilage =privilegeDetails.split(",");
            Privilege[] p = new Privilege[privilage.length];
            for(j=0;j<privilage.length;j++){
                p[j] = new Privilege(privilage[j]);
            }
            role[i].setPrivilege(p);
        }
        
        System.out.println("Role names which has more number of privileges :");
        Role[] rol = new RoleBO().findRoleWithMaxPrivilege(role);
        for(i=0;i<rol.length;i++)
        {
        	System.out.println("\n"+rol[i].getName());
        	for(Privilege p : rol[i].getPrivilege())
        		System.out.print(p.getName()+",");
        }
    }
    
}
