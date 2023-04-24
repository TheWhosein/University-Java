import java.util.*;

public class O {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int min=0,max=0;
		min = (n + k - 1) /k;
		max = n - k + 1;
		System.out.print(min+" "+ max);

		input.close();
	}

}
