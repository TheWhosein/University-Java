import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(), y=0;
		if(n % 2 == 0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
	}
}