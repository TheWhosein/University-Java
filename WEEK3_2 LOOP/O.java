import java.util.*;

public class O {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(), a = input.nextInt();
		long sum = 0;
		if (a == 1) {
			for (int i = 1; i <= n; i++)
			{
				sum+=i;
			}
			System.out.println(sum);
		}
		else if(a==1 && n==1) {
			System.out.println(1);
		}
		else
		{
			for (int i = 1; i <= n; i++)
			{
				sum+=i*Math.pow(a,  i);
			}
			System.out.print(sum);
		}
		input.close();
	}

}
