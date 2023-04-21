import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a, b, c;
		a = input.nextInt();
		b = a%10;
		a /= 10;
		System.out.print((int)Math.pow(a+b, 2));
		input.close();
	}

}