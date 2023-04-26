import java.util.*;

public class P {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		n=Math.abs(n);
		while(n>99) {
			n/=10;
		}
		System.out.print(n%10);
		input.close();
	}

}
