import java.util.Scanner;
public class ex7_4 {
	static int sumUp(int n) {
		int sum=0;
		for (int i=0;i<=n;i++) {
			sum+=i;
		}
		 return sum;
	}
	
      

 public static void main(String[]args) {
	 Scanner stdin=new Scanner (System.in);
	 System.out.println("1~n�����v���܂��B");
	 
	 int n;
	do {
		 System.out.println("��������͂��Ă��������F");
		  n=stdin.nextInt();	
		 
	 }while (n<=1);
	 System.out.printf("1����%���܂ł̍��v�́����ł��B",n,sumUp(n));
	 
 }
}
 