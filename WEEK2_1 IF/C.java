import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0;
		a = input.nextLong();
		if(a>7) {
			b = a*a*a + 2*a;
		}
		else if(a<=7 && a>=-4) {
			b = a*a - 3*a;
		}
		else if(a<-4) {
			b = a + 5;
		}
		System.out.print(b);
		input.close();
	}

}