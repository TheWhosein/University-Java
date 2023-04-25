import java.util.*;
public class G {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		int k =0;
		while(n!=0) {
			if(n%10==5) k++;
			n/=10;
		}
		System.out.print(k);
		input.close();
	}

}
