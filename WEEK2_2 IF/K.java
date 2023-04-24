import java.util.*;
public class K {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int k=m/n;
		int f=m%n; 
		if(f!=0){ 
			System.out.print(k+1);
			} 
		else{ 
			System.out.print(k);
		}

		input.close();
	}

}
