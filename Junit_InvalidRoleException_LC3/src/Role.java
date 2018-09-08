public class Role {
	private int id;
	private String name;
	static Role[] role = new Role[3]; 
	public Role(){}
	public Role(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void loadRoles() {
		role[0] = new Role(10,"Agent");
		role[1] = new Role(20,"Customer");
		role[2] = new Role(30,"Shipper");
	}
}