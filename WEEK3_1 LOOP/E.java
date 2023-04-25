import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		long m = input.nextLong();
		int k =0;
		n=Math.abs(n);
		while(n!=0) {
			if(m==n%10) {
				k++;
			}
			n/=10;
		}
		System.out.print(k);
		input.close();
	}

}