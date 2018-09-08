public class ShipmentBO {
	public String[] findOneModes(int n, String[] input) {
		int i;
		int j;
		int count;
		int oneMode = 0;
		String[] oneModeCities = new String[n];
		for (i = 0; i < n; i++) {
			count = 0;
			String splitInput[] = input[i].split("\\|");
			for (j = 2; j <= 4; j++) {
				if (splitInput[j].equals("1"))
					count++;
			}
			if (count == 1) {
				oneModeCities[oneMode] = splitInput[1];
				oneMode++;
			}
		}
		return oneModeCities;
	}

	public String[] findMultipleModes(int n, String[] input) {
		int i;
		int j;
		int count;
		int moreThanOneMode = 0;
		String[] moreThanOneModeCities = new String[n];
		for (i = 0; i < n; i++) {
			count = 0;
			String splitInput[] = input[i].split("\\|");
			for (j = 2; j <= 4; j++) {
				if (splitInput[j].equals("1"))
					count++;
			}
			if (count > 1) {
				moreThanOneMode++;
			}
		}

		moreThanOneMode = 0;
		for (i = 0; i < n; i++) {
			count = 0;
			String splitInput[] = input[i].split("\\|");
			for (j = 2; j <= 4; j++) {
				if (splitInput[j].equals("1"))
					count++;
			}
			if (count > 1) {
				moreThanOneModeCities[moreThanOneMode] = splitInput[1];
				moreThanOneMode++;
			}
		}
		return moreThanOneModeCities;
	}
}