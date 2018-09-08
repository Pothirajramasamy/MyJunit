import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		Role.loadRoles();
		System.out.println("Enter the user id :");
		int userId = Integer.parseInt(buff.readLine());
		System.out.println("Enter the name :");
		String name = buff.readLine();
		System.out.format("%-15s %s\n","Role ID","Role Name");
		for(int i=0;i<Role.role.length;i++)
			System.out.format("%-15s %s\n",Role.role[i].getId(),Role.role[i].getName());
		System.out.println("Enter the role id :");
		int roleId = Integer.parseInt(buff.readLine());
		User user;
		try {
			user = new RoleBO().isRolePresent(userId, name, roleId);
			System.out.println("User details :\nUser id : "+user.getId());
			System.out.println("Name : "+user.getName());
			System.out.println("Role id: "+user.getRole().getId());
			System.out.println("Role : "+user.getRole().getName());
		} catch (InvalidRoleException e) {
			System.out.println(e);
		}
	}
}