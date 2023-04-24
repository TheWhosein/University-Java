import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k=input.nextInt();
		int i=1;
		while(k>0) {
			int t = input.nextInt();
			if(t%3==0) {
				System.out.println("GCV");
			}
			else if(t%3==1) {
				System.out.println("VGC");
			}
			else if(t%3==2) {
				System.out.println("CVG");
			}
			k=k-1;
		}
		input.close();
	}

}