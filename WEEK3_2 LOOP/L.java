import java.util.*;
public class L {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n=sc.nextInt(), count=0, quantity=0;
		double price=0;
		while(n!=0) {
			quantity=sc.nextInt();
			price=sc.nextDouble();
			if(price<50.0) {
				count+=quantity;
			}
			n--;
		}
		System.out.print(count);
		sc.close();
	}

}
