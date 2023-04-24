import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = "";
		for(int i=0;i<n;i++) {
			int l = input.nextInt();
			int w = input.nextInt();
			int h = input.nextInt();
			int say = 2*(l*h+w*h)/16;
			if((l*h+w*h)%8!=0)say++;
			result = result + say + "\n";
		}
		System.out.println(result);
		
		
		input.close();
	}

}