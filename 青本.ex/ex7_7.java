import java.util.Scanner;
public class ex7_7 {
static void putChars(int n) {
	for (int i=0;i<=n;i++) {
		
		for(int k=i;k>0;k--)
			System.out.print("*");
		for(int j=n-1;j>0;j--)
			System.out.print(" ");
		System.out.println();
	}
}
public static void main(String[]args) {
	Scanner stdin=new Scanner (System.in);
	System.out.println("左下直角の三角形を作る");
	System.out.print("段数：");
	int n=stdin.nextInt();
	putChars(n);
}

}
