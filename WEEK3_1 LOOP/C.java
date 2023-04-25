import java.util.*;

public class C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		long sum=0;
		n=Math.abs(n);
		sum+=n%10;
		while(true) {
			n/=10;
			if(n<10) {
				break;
			}
		}
		sum+=n;
		System.out.print(sum);
		input.close();
	}

}