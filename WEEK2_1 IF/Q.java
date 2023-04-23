import java.util.*;

public class Q {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0, d=0;
		a = input.nextLong();
		b = input.nextLong();
		c = input.nextLong();
		if(a>=b && a<=c) {
			System.out.print("IN");
		}
		else {
			System.out.print("OUT");
		}
		
		input.close();
	}

}
