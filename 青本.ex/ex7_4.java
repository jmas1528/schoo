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
	 System.out.println("1~nを合計します。");
	 
	 int n;
	do {
		 System.out.println("整数を入力してください：");
		  n=stdin.nextInt();	
		 
	 }while (n<=1);
	 System.out.printf("1から%ｄまでの合計は％ｄです。",n,sumUp(n));
	 
 }
}
 