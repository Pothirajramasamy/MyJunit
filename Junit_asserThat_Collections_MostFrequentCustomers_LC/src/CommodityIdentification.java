public class CommodityIdentification {
	
	private String description;
	private String model;
	private String serial;
	private Customer customer;
	
	public CommodityIdentification(String description, String model,
			String serial, Customer customer) {
		super();
		this.description = description;
		this.model = model;
		this.serial = serial;
		this.customer = customer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
