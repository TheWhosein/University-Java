import java.util.*;

public class P {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a, b, q1, q2, q3, q4, qq; 
		a=input.nextInt();
		b=input.nextInt(); 
		for (long i = a; i <= b; i++) { 
			q1 = i % 10; 
			q2 = i / 10 % 10; 
			q3 = i / 100 % 10; 
			q4 = i / 1000 % 10; 
			qq = q1*q1*q1*q1 + q2*q2*q2*q2 + q3*q3*q3*q3 + q4*q4*q4*q4; 
			if (qq == i) 
				System.out.print(i+" ");; 
		} 
		
		input.close();
	}

}
