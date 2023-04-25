import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		long l=String.valueOf(n).length();
                for(long i=0;i<l;i++) {
			System.out.print(n%10);
			n/=10;
		}
		input.close();
	}
}