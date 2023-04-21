import java.util.*;

public class C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt(), y=0;
		if(x>=13) {
			y = ((3*x*x*x) + (4*(x*x)) + (5*x) + 6);
		}
		else {
			y = ((3*x*x*x) - (2*(x*x)) - (3*x) - 4);
		}
		System.out.println(y);

	}

}
