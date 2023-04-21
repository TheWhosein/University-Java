import java.util.*;

public class J {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a = input.nextLong();
		Long b = input.nextLong();
		for(Long i=a;i<=b;i++) {
			System.out.print(i*i+" ");
		}
		System.out.println("");
		for(Long i=b;i>=a;i--) {
			System.out.print(i*i*i+" ");
		}

	}

}
