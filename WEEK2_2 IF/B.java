import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a1=0, b1=0, c1=0, a2, b2, c2, a3, b3, c3, k, w;
		k = input.nextLong();
		w = input.nextLong();
		a1 = input.nextLong();
		b1 = input.nextLong();
		a2 = input.nextLong();
		b2 = input.nextLong();
		a3 = input.nextLong();
		b3 = input.nextLong();
		if(w>=a1 && k<=b1|| w>=a2 && k<=b2 || w>=a3 && k<=b3 || w>=a1+a2 && k<=b1+b2 || w>=a1+a3 && k<=b1+b3 || w>=a3+a2 && k<=b3+b2 || w>=a1+a2+a3 && k<=b1+b2+b3) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
		
		input.close();
	}

}