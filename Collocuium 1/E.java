import java.util.*;
public class E {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
	    int b = input.nextInt();
	    for (int i = a; i <= b; i++) {
	    	if ((i / 100 % 10) * (i / 100 % 10) * (i / 100 % 10) +
                   (i / 10 % 10) * (i / 10 % 10) * (i / 10 % 10) +
                    (i % 10) * (i % 10) * (i % 10) == i) {
	                System.out.print(i + " ");
	            }
	        }

	}

}
