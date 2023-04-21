import java.util.*;

public class F {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
        double b = input.nextDouble();
	    double h = input.nextDouble();
	    for (double x = a; x <= b; x += h) {
	    	System.out.printf("%.3f %.3f\n", x, 3 * Math.sin(x));
	    }
	}

}
