import java.util.*;

public class F {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String[] time1;
		String[] time2;
		time1= in.next().split(":");
		time2= in.next().split(":");
		int h2=Integer.parseInt(time1[0]),m2=Integer.parseInt(time1[1]),s2=Integer.parseInt(time1[2]);
		int h1=Integer.parseInt(time2[0]),m1=Integer.parseInt(time2[1]),s1=Integer.parseInt(time2[2]);
		int h,m,s;
		
		if(s1>=s2) {
			s=s1-s2;
		}else {
			s=(s1+60)-s2;
			m1=m1-1;
		}
		if(m1>=m2) {
			m=m1-m2;
		}else {
			m=(m1+60)-m2;
			h1=h1-1;
		}
			h=h1-h2;
			if(h<0) {
				h=24+h;
			}	
		System.out.printf("%02d:%02d:%02d", h,m,s);
	}

}
