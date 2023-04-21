import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a, b;
		a = input.nextInt();
		b = input.nextInt();
		System.out.print(a*a+b*b);
		input.close();
	}

}