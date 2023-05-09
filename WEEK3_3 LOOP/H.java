import java.util.*;

public class H {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n, s = 0;
		n = input.nextLong();
		for(int i=1;i<=n;++i){ 
			if(n%i==0 && i%2!=0){ 
				System.out.println(i);
				}
			} 
		input.close();
	}

}
