public class Customer implements Comparable<Object>{
	private String name;
	private String email;
	
	public Customer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setUsername(String email) {
		this.email = email;
	}
	public int compareTo(Object obj){
		Customer c = (Customer) obj;
		return this.name.compareTo(c.name);
	}

}