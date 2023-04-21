import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		a = input.nextInt();
		System.out.print(a/10 + " " + a%10);
		input.close();
	}

}