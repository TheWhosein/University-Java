import java.util.*;
public class M {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a = input.nextLong();
		long b = input.nextLong();
		long sum = 0;
		if(a%2==0) {
			a++;
		}
		for(long i=a;i<=b;i++) {
				sum+=i;
				i++;
		}
		System.out.print(sum);
		input.close();
	}

}
