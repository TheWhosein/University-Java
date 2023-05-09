import java.util.*;

public class F {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n, mul = 1;
		n = input.nextLong();
		while(n!=0) {
			mul*=n%10;
			n/=10;
		}
		System.out.print(mul);
		input.close();
	}

}
