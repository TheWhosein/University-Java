import java.util.*;

public class N {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0, d=0;
		a = input.nextLong();
		if(a>0) {
			b = 1;
		}
		else if(a == 0) {
			b = 0;
		}
		else {
			b = -1;
		}
		System.out.print(b);
		
		input.close();
	}

}
