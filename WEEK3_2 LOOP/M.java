import java.util.*;
public class M {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n=sc.nextInt();
		double mul=1, sum=0;
		while(n!=0) {
			mul*=n%10;
			sum+=n%10;
			n/=10;
		}
		System.out.printf("%.3f",(mul/sum));
		sc.close();
	}

}
