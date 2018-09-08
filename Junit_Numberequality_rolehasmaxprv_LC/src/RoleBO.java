
public class RoleBO {
    public RoleBO(){}
    public Role[] findRoleWithMaxPrivilege(Role[] role)
    {
        int count,i;
        int c=0;
        this.sortRoleByName(role);
        count = this.CountMaxNoOfPrivilege(role);
        Integer no = this.countNoofMaxPrivilege(role,count);
        Role[] rol = new Role[no];
        for( i = 0;i < role.length;i++)
            if(role[i].getPrivilege().length == count)
            	rol[c++] = role[i];
        return rol;
    }
    
    public Integer countNoofMaxPrivilege(Role[] role, Integer count)
    {
    	int i,no=0;
    	for( i = 0;i < role.length;i++)
            if(role[i].getPrivilege().length == count)
            	no++;
    	return no;
    }
    
    public void sortRoleByName(Role[] role)
    {
    	Role temp;
    	for(Integer i = 0 ; i < role.length; i++)
    	{
    		for(Integer j = i+1; j < role.length ; j++)
    			if(role[i].getName().compareTo(role[j].getName())>0)
    			{
    				temp = role[i];
    				role[i] = role[j];
    				role[j] = temp;
    			}
    	}
    }
    
    public Integer countNumberOfPrivilege(Role role)
    {
    	return role.getPrivilege().length;
    }
    
    public Integer CountMaxNoOfPrivilege(Role[] role)
    {
    	Integer max = this.countNumberOfPrivilege(role[0]);
    	for(Integer i = 1 ; i < role.length;i++)
    		if(max < this.countNumberOfPrivilege(role[i]))
    			max = this.countNumberOfPrivilege(role[i]);
    	return max;
    }
    
}
