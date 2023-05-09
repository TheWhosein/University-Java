import java.util.*;
public class G {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n, s = 0;
		n = input.nextLong();
		for(int i=1;i<=n;++i){ 
			if(n%i==0){ 
				s=s+1;
				}
			} 
		System.out.print(s);
		input.close();
	}

}
