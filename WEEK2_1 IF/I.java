import java.util.*;

public class I {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0;
		a = input.nextLong();
		b = input.nextLong();
		if (a>b) {
			System.out.print(b+" "+a);
		}
		else {
			System.out.print(a+" "+b);
		}
		input.close();
	}

}
