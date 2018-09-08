
public class Role extends RoleBO{
    private String name;
    private Privilege[] privilege;

    public Role(){}
    
    public Role(String name, Privilege[] privilege) {
		super();
		this.name = name;
		this.privilege = privilege;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Privilege[] getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Privilege[] privilege) {
        this.privilege = privilege;
    }
}
