import java.util.*;

public class N {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y; 
		x=input.nextInt();
		y=input.nextInt();
		for(int i=x; i<=y; i++) { 
			int x1=i/1000; 
			int x2=i/100%10; 
			int x3=i/10%10; 
			int x4=i%10; 
			if(x1%2==1 && x2%2==1 && x3%2==1 && x4%2==1) { 
				System.out.print(i+" "); 
				}
		}
		input.close();
	}

}
