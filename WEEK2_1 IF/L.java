import java.util.*;
public class L {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0, d=0;
		a = input.nextLong();
		if(a>=0) {
			b = a*a*a+2*a*a+4*a-6;
		}
		else {
			b = a*a*a-7*a;
		}
		System.out.print(b);
		
		input.close();
	}

}
