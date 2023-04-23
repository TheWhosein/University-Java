import java.util.*;

public class F {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0;
		a = input.nextLong();
		b = input.nextLong();
		c = input.nextLong();
		if(a % b == 0 && a % c == 0) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
		input.close();
	}

}
