import java.util.*;

public class Q {

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
