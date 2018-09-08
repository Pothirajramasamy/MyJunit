public class CustomerBO {
	public Integer findNextCustomerId(Integer n, Integer[] customerId) {
		Integer max = customerId[0];
		for (int i = 1; i < n; i++) {
			if (max < customerId[i])
				max = customerId[i];
		}
		return max;
	}
}
