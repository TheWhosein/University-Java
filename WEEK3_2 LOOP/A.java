import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		int total = 0;
		while(n>1) {
			if(n%2==0) {
				n=n/2;
				total+=1;
			}
			else {
				n+=1;
				total+=1;
			}
		}
		System.out.print(total);
		input.close();
	}

}