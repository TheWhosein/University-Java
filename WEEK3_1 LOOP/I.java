import java.util.*;

public class I {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y; 
		x=input.nextInt();
		y=input.nextInt();
		for (int i = x; i < y + 1; i++){ 
			int a = i / 1000; 
			int b = (i / 100) % 10; 
			int c = (i / 10) % 10; 
			int d = i % 10; 
			if ( (a != b) && (a != c) && (a != d) && (b != c) && (b != d) && (c != d) ) 
				System.out.print(i+" "); 
		}
		input.close();
	}

}
