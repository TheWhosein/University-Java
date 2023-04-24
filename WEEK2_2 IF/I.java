import java.util.*;

public class I {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if(n >=3 && n<=5) {
			System.out.println("Spring");
		}
		else if(n >=6 && n<=8) {
			System.out.println("Summer");
		}
		else if(n >=9 && n<=11) {
			System.out.println("Autumn");
		}
		else if(n == 12 || n==2 || n==1) {
			System.out.println("Winter");
		}
	}

}
