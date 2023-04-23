import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0;
		a = input.nextLong();
		b = input.nextLong();
		if(a % b == 0) {
			System.out.print("Divisible");
		}
		else {
			System.out.print((int)(a/b)+ " ");
			System.out.print(a-(int)(a/b)*b);
		}
		input.close();
	}

}