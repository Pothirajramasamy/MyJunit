public class ShipmentBO {

	public double calculateAverage(int n1, double wt1, int n2, double wt2) {
		if (n1 + n2 == 0)
			return 0;
		return ((n1 * wt1) + (n2 * wt2)) / (n1 + n2);
	}

}
