import java.util.*;
public class L {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a;
		a=new int[3];
		int tek=0, cut=0;
		a[0]=input.nextInt();
		a[1]=input.nextInt();
		a[2]=input.nextInt();
		for(int i=0;i<3;i++) {
			if(a[i]%2==0)
				cut++;
			else tek++;
		}
		if(tek!=0 && cut!=0) System.out.print("YES");
		else System.out.print("NO");
		input.close();
	}

}
