import java.util.*;

public class J {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int p =0;
		char a='1';
		String s=Integer.toBinaryString(n);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == a) {
				p++;
			}
		}
		System.out.print(p);
		input.close();
	}
}