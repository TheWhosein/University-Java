import java.util.*;

public class H {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long sum=0;
		while(input.hasNextInt()) {
			sum += input.nextInt();
		}
		System.out.println(sum);
		input.close();
	}

}
