import java.util.Objects;

public class ShipmentEntity {
	private Integer id;
	private String name;
	private String accountNumber;
	private Long creditLimit;
	private String address;

	public ShipmentEntity() {
	}

	public ShipmentEntity(Integer id, String name, String accountNumber, Long creditLimit, String address) {
		this.id = id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.creditLimit = creditLimit;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Long creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		ShipmentEntity shipmentEntity = (ShipmentEntity) o;
		return Objects.equals(id, shipmentEntity.id) && Objects.equals(name, shipmentEntity.name)
				&& accountNumber.equals(shipmentEntity.accountNumber)
				&& Objects.equals(creditLimit, shipmentEntity.creditLimit) && address.equals(shipmentEntity.address);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, accountNumber, creditLimit, address);
	}

}