import java.util.*;

public class F {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n=input.nextLong();
		long m=input.nextLong();
		long res=0, i;
		if (n >= m) 
			res = 0; 
		else{
			for(res = i = 1; i <= n; i++)
				res = (res * i) % m;
		} 
		System.out.println(res);
		input.close();
	}

}
