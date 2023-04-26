import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = 0;
		while(n>=1) {
			for(int i=1;i<=n;i++) {
				if(n%i==n/i) {
					m++;
				}
			}
			System.out.print(m);
			break;
		}
		input.close();
	}
}