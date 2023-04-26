import java.util.*;

public class N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n=sc.nextInt();
		int min1=100000, max1=-100000;
		if(n<2) {
			System.out.print("Ooops!");
		}
		else {
			while(n!=0) {
				int w=sc.nextInt();
				if (w <= min1) min1 = w;
				if (w >= max1) max1 = w;
				n--;
			}
			System.out.print(min1+" "+max1);
		}
		sc.close();
	}

}
