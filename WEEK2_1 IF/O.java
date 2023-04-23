import java.util.*;

public class O {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0, d=0;
		a = input.nextLong();
		if(a>0) {
			System.out.print("Water");
		}
		else {
			System.out.print("Ice");
		}
		
		input.close();
	}

}
