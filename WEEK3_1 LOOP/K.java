import java.util.*;
public class K {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n; 
		n=input.nextLong(); 
		long b = 0;
		int k=0;
		long pon = 0; 
		while(n > 0){ 
			b = n % 10; 
			if(b > pon) {
				pon = b;
				k=0;
			}
			if(pon==b)
				k++;
			
			n = n / 10;
			}
		System.out.print(k);;
		input.close();
	}

}
