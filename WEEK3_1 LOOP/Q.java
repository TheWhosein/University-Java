import java.util.*;

public class Q {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a;
		a=input.nextInt();
		int result=1;
		while(a!=0) {
			if(a%10!=0)
				result*=a%10;
			a/=10;
		}
		System.out.print(result);
		input.close();
	}

}
