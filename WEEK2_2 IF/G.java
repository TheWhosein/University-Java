import java.util.*;
public class G {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a=n%10;
		n/=100;
		if(a>n) {
			System.out.print(a);
		}
		else if(n>a) {
			System.out.print(n);
		}
		else {
			System.out.print("=");
		}
		
		input.close();
	}

}
