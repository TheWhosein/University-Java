import java.util.*;

public class J {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n; 
		n=input.nextLong(); 
		long b = 0; 
		long pon = 0; 
		while(n > 0){ 
			b = n % 10; 
			if(b > pon)
				pon = b; 
				n = n / 10; 
			} 
		System.out.print(pon);;
		input.close();
	}
}