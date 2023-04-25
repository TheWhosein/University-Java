import java.util.*;

public class F {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		int k =0;
		int tek=0, cut=0;
		n=Math.abs(n);
		while(n!=0) {
			if(k%2==0) cut+=n%10;
			else tek+=n%10;
			k++;
			n/=10;
		}
		System.out.print(tek*cut);
		input.close();
	}

}
