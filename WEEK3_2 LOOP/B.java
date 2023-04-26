import java.util.Scanner;

public class B {
		private static Scanner in;

		public static void main(String[] args)
		{
			in = new Scanner(System.in);
			while(in.hasNextInt())
			{
				int a = in.nextInt(), b = in.nextInt(), max = 0;
				for(int i=Math.min(a, b), j=Math.max(a, b); i<=j; i++) max = Math.max(max, getCycleLength(i));
	      System.out.println(a + " " + b + " " + max);
	    }
	  }

	  private static int getCycleLength(int n)
	  {
	  	int say = 1;
	    while(n > 1)
	    {
	    	if (n%2 == 0) n = n / 2;
	      else n = 3*n + 1;
	      say++;
	    }
	    return say;
	  }
	}