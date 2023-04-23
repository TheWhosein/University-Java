import java.util.*;

public class J {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a=0, b=0, c=0, d=0;
		int[] arr = new int[4];
		for(int i=0;i<4;i++) {
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		System.out.print(arr[3]);
		input.close();
	}
}
