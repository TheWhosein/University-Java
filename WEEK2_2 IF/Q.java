import java.util.*;

public class Q {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a= input.nextInt();
		if(a>0) System.out.print("Positive");
		else if(a==0) System.out.print("Zero");
		else System.out.print("Negative");
		
		input.close();
	}

}
