import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		System.out.println(new RoundOffBO().getRoundOffValue(value));
	}
}