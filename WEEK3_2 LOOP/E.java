import java.util.*;

public class E {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int ns[] = new int[32];
	    for(int i=in.nextInt(); i>0; i--) {
	      int n = in.nextInt();
	      Arrays.fill(ns, 0);
	      in.nextLine();
	      for(int j=0; j<n; j++)
	        for(int s=in.nextInt(), e=in.nextInt(); s<=e; s++)
	          ns[s]++;
	      boolean isPossible = false;
	      for(int k : ns)
	        if(k == n) {
	          isPossible = true;
	          break;
	        }
	      System.out.println(isPossible ? "YES" : "NO");
	    }
	}

}