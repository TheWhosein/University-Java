import java.util.*;

public class H {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = input.nextLong();
        long c = (b * (b + 1) - a * (a - 1)) / 2;
        System.out.println(c);
	}

}
