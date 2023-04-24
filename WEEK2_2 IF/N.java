import java.util.*;

public class N {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int k = input.nextInt();
		System.out.print(Math.min(m,Math.min(k, n)));

		input.close();
	}

}
