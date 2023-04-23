import java.util.*;
public class K {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0, d=0;
		a = input.nextLong();
		if(a>=1 && a<=3) {
			System.out.print("Initial");
		}
		else if(a>=4 && a<=6) {
			System.out.print("Average");
		}
		else if(a>=7 && a<=9) {
			System.out.print("Sufficient");
		}
		else if(a>=10 && a<=12) {
			System.out.print("High");
		}
		
		input.close();
	}

}
