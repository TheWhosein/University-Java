import java.util.Scanner;

public class B {
	static int ReqemCemi(int x)
    {
        int cem = 0;
        while (x > 0)
        {
            cem = cem + x%10;
            x = x/10;
        }
        return cem;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n=sc.nextInt();
		int say = 0;
        while (n > 0)
        {
            n = n - ReqemCemi(n);
            say++;
        }
        System.out.print(say);
		sc.close();
	}
}