
public class ShipmentBO {
	
	public double findLeftOutValue(double[] profits) {
		double leftOutValue;
		leftOutValue = profits[0];
		for(int i=1;i<profits.length;i++)
			if(leftOutValue > profits[i])
				leftOutValue = profits[i];
		return leftOutValue;
	}
}
