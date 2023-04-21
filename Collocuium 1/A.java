import java.util.*;

public class A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int l = n, k = 0;
		while(n!=0) {
			k = (k * 10) + n%10;
			n /= 10;
		}
		if(k == l) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
