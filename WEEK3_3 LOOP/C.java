import java.util.*;

public class C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int a,m,n = 0; 
		 a=input.nextInt();
		 m=input.nextInt();
		 while (m!=0) { 
			 n++; 
			 if (m == a*2) 
				 break; 
			 m-=a; 
			 a++; } 
		 System.out.println(n);
		input.close();
	}

}