import java.util.*;

public class P {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int k = input.nextInt();
		int a = 0, b=0, c=0;
		if(n%k==0) 
			a=n/k; 
		else if(n%k!=0) 
			a=n/k+1; 
		if(m%k==0) 
			b=m/k; 
		else if(m%k!=0) 
			b=m/k+1; 
		c=a+b;
		System.out.print(c);
		input.close();
	}

}
