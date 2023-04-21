import java.util.*;

public class I {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(), l=0;
		double k = 0, sum = 0;
		while(n!=0) {
			k = input.nextDouble();
			if(k>0) {
				sum+=k;
				l++;
			}
			
			n--;;
		}
		if(sum!=0) System.out.printf("%.2f",sum/l);
		else System.out.println("Not Found");
	}

}
