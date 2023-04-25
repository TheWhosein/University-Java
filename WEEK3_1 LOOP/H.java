import java.util.*;

public class H {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		int k = 0;
		n=Math.abs(n);
		while(n>9) {
			n/=10;
		}
		System.out.print(n);
		input.close();
	}

}
