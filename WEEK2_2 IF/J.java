import java.util.*;

public class J {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a;
		a = new int[3];
		int[] b;
		b=new int[2];
		a[0]=input.nextInt();
		a[1]=input.nextInt();
		a[2]=input.nextInt();
		b[0]=input.nextInt();
		b[1]=input.nextInt();
		Arrays.sort(a);
		Arrays.sort(b);
		if (a[0] <= b[0] && a[1] <= b[1]) System.out.print("YES");
		else System.out.print("NO");
		
		input.close();
	}
}
