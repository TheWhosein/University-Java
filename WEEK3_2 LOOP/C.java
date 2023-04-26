import java.util.*;

public class C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float l = input.nextInt();
		int k= input.nextInt();
		int say = 0;
		while(l>1) {
			l = l / k;
			if(l>1) {
				say++;
			}
		}
		System.out.print(say);
		input.close();
	}

}