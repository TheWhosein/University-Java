import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0;
		a = input.nextLong();
		if(a>=5) {
			b = a + 7;
		}
		else if(a<5) {
			b = a*a - 3*a + 4;
		}
		System.out.print(b);
		input.close();
	}

}