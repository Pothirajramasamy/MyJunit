
public class ShipmentBO {

	public double calculateAveragePrice(int contPrice,int noOfItem) {
		int avgPrice = 0;
		avgPrice = contPrice / noOfItem;
		return avgPrice;
	}
}
