import java.util.*;

public class R {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0;
		a = input.nextLong();
		b = input.nextLong();
		c = input.nextLong();
		System.out.print((a * 7 + b - 2) * (a - c + 5));
		input.close();
	}

}
