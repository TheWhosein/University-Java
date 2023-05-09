import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n,m,a; 
		n=input.nextLong(); 
		for(a=1; a<7000; a++){ 
			if(a<10) 
				n--; 
			else if(a>9 && a<100) 
				n-=2; 
			else if(a>99 && a<1000) 
				n-=3; 
			else if(a>999 && a<10000) 
				n-=4; 
			if(n==0){ 
				System.out.print(a); 
				break;
				} 
			else if(n<0){ 
				System.out.print(0);; 
				break; 
				} 
			}
		 
		input.close();		
	}
}