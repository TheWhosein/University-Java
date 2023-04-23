import java.util.*;

public class H {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0;
		a = input.nextLong();
		b = input.nextLong();
		if (a%2==0 && b%2==0 || a%2==1 && b%2==1) {
			System.out.print(1);
		}
		else {
			System.out.print(0);
		}
		input.close();
	}

}
