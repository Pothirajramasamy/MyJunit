public class Commodity {
	
	private Double weight;
	private Double quantity;
	private CommodityIdentification commodityIdentification;
	
	public Commodity(Double weight, Double quantity,
			CommodityIdentification commodityIdentification) {
		super();
		this.weight = weight;
		this.quantity = quantity;
		this.commodityIdentification = commodityIdentification;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public CommodityIdentification getCommodityIdentification() {
		return commodityIdentification;
	}

	public void setCommodityIdentification(
			CommodityIdentification commodityIdentification) {
		this.commodityIdentification = commodityIdentification;
	}

	
}