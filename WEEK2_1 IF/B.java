import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0;
		a = input.nextLong();
		if(a>=10) {
			b = a*a*a + 5*a;
		}
		else if(a<10) {
			b = a*a - 2*a + 4;
		}
		System.out.print(b);
		input.close();
	}

}