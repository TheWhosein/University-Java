import java.util.*;
public class G {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0;
		a = input.nextLong();
		a = Math.abs(a);
		System.out.print((a/100)%10+"\n"+(a/10)%10+"\n"+a%10);
		input.close();
	}

}
