import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		long a = input.nextLong();
		long b = input.nextLong();
		long c = input.nextLong();
		long uzler = 2*(a*b+a*c+b*c);
		long say = a*b*c;
		System.out.print(say+" "+ (6*say-uzler));
		
		
		input.close();
	}
}