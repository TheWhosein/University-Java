import java.util.*;
public class G {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong(), sum=0;
		n = Math.abs(n);
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		System.out.println(sum);
	}

}
