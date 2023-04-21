import java.util.*;

public class H {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong(), sum=0;
		n = Math.abs(n);
		sum = n%10;
		while(n>9) {
			n/=10;
		}
		sum+=n;
		System.out.println(sum);

	}

}
