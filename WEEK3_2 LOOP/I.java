import java.util.*;

public class I {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int e=sc.nextInt();
		int f=sc.nextInt();
		int c=sc.nextInt();
		int n=e+f, cem=0, q=0;
		while(n>=c) {
		    q=n%c;
		    cem+=n/c;
		    n=n/c+q;
		}
		System.out.println(cem);
		sc.close();
	}

}
