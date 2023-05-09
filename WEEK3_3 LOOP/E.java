import java.util.*;

public class E {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n,m=0; 
		n=input.nextLong(); 
		while (n != 0) { 
			m = m + n / 5;
			n /= 5;
			}
		System.out.print(m);;
		 
		input.close();	
	}

}