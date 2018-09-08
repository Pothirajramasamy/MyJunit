;public class RoleBO {
	
	public User isRolePresent(int userId,String name,int roleId) throws InvalidRoleException {
		Role.loadRoles();
		int i;
		for(i=0;i<Role.role.length;i++) {
			if(Role.role[i].getId() == roleId) {
				break;
			}
		}
		if(i==Role.role.length)
			throw new InvalidRoleException("Role id is invalid");
		return new User(userId,name,Role.role[i]);
	}
	
}