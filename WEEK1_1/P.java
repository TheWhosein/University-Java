import java.util.*;

public class P {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0;
		a = input.nextLong();
		b=a%10;
		a/=100;
		System.out.print(a+""+b);
		input.close();
	}

}
