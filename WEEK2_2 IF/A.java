import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0, a1, b1, c1;
		a = input.nextLong();
		b = input.nextLong();
		c = input.nextLong();
		a1 = input.nextLong();
		b1 = input.nextLong();
		c1 = input.nextLong();
		a1=a1*3600;
		b1=b1*60;
		a=a*3600;
		b=b*60;
		c1=(a1+b1+c1)-(a+b+c);
		a=c1/3600;
		c1=c1-(a*3600);
		b=c1/60;
		c1=c1-(b*60);
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		System.out.print(c1);
		
		input.close();
	}

}