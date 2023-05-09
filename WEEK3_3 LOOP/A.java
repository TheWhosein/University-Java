import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n, ans = 0;
		n = input.nextLong();
		String s = String.valueOf(n);
		System.out.print(s.length());
		input.close();
	}

}