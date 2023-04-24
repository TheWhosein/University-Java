import java.util.*;

public class H {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double x1,x2;
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        long c=sc.nextLong();
        double d=Math.pow(b,2)-4*a*c;
        if(d<0)
        {
            System.out.println("No roots");
        }
        else if(d==0)
        {
            System.out.println("One root: "+(long)(-b/(2*a)));
        }
        else
        {
            x1=(-b-Math.sqrt(d))/(2*a);
            x2=(-b+Math.sqrt(d))/(2*a);
            System.out.println("Two roots: "+(long)Math.min(x1,x2)+" "+(long)Math.max(x1,x2));
        }
	}

}
