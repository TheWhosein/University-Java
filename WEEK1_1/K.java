import java.util.*;
public class K {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0;
		a = input.nextLong();
		b = input.nextLong();
		System.out.println(b-(int)(b/a)*a);
		input.close();
	}

}
