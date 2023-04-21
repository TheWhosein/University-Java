import java.util.*;

public class Q {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0;
		a = input.nextLong();
		a/=10;
		b=a%10;
		a/=10;
		c=a%10;
		System.out.print(c*10+b);
		input.close();
	}

}
