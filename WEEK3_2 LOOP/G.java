import java.util.*;
public class G {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n=input.nextLong();
		while(n!=0) {
			long a=input.nextLong();
			long b=input.nextLong();
			System.out.println(a+b);
			n--;
		}
		input.close();
	}

}
