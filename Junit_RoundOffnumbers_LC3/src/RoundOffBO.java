public class RoundOffBO {
	public int getRoundOffValue(int value) {
		if((value%10) == 0) {
			return value;
		}
		else if((value%10) < 5) {
			return (value - (value%10) );
		}
		else {
			return (value + (10 - (value%10) ) );
		}
	}
}