import java.util.*;

public class P {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0, d=0;
		a = input.nextLong();
		b = input.nextLong();
		c = input.nextLong();
		if(a>=b && a<=c) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
		
		input.close();
	}

}
