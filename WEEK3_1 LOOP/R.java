import java.util.*;

public class R {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		long n = sc.nextLong(), k=0;
		while(n!=0) {
			if((n%10)%2!=0) k=k*10+n%10;
			n/=10;
		}
		if(k!=0) {
			while(k!=0) {
				System.out.print(k%10);
				k/=10;
			}
		}
		else {
			System.out.print(0);
		}
		sc.close();
	}

}
