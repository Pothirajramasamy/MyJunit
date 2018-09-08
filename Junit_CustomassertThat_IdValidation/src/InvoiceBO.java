
public class InvoiceBO {

	public String generateInvoiceId(String str1) {
		StringBuilder str = new StringBuilder(str1);
		if (str.substring(0, 2).toString().equals("CU")) {
			str.replace(0, 2, "CUR");
		}

		else if (str.substring(0, 2).toString().equals("AT")) {
			str.replace(0, 2, "AGT");
		} else if (str.substring(0, 2).toString().equals("CY")) {
			str.replace(0, 2, "CMY");
		}
		int len = str1.length();
		if (len == 3) {
			str.replace(3, 7, "0000" + str.substring(3, 4));
		} else if (len == 4) {
			str.replace(3, 7, "000" + str.substring(3, 5));
		} else if (len == 5) {
			str.replace(3, 7, "00" + str.substring(3, 6));
		} else if (len == 6) {
			str.replace(3, 7, "0" + str.substring(3, 7));
		}
		return str.toString();
	}
}
