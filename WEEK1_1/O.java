import java.util.*;

public class O {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0;
		a = input.nextLong();
		while(a!=0) {
			b=b*10+a%10;
			a/=10;
		}
		System.out.print(b);
		input.close();
	}

}
