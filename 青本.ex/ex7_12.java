import java.util.Scanner;
public class ex7_12 {
	static void printBits(int x) {
		for (int i=31;i>=0;i--)
			System.out.print(((x>>>i&1)==1)?"1":"0");
	}
	static int rRotate(int x,int n) {
		for (int i=0;i<n;i++) {
		if((x&1)==1) {
			x>>>=1;
			x=-2147483648|x;
		}else {
		x>>>=1;
		}
	
		}return x;
	}
	static int lRotate(int x,int n) {
		for (int i=0;i<n;i++) {
		if((x&-2147483648)==-2147483648) {
			x<<=1;
			x=1|x;
		}else {
		x<<=1;
		}
	
		}return x;
	}	
public static void main(String[]args) {
	Scanner stdin=new Scanner(System.in);
	
	System.out.print("�����F");
	int x=stdin.nextInt();
	System.out.print("�r�b�g���F");
	printBits(x);
	System.out.println("");
	System.out.print("�E�ɂ���r�b�g��]�����l   n:");
	int n=stdin.nextInt();
	System.out.println(rRotate(x,n));
	printBits(rRotate(x,n));
	System.out.println("");
	System.out.print("���ɂ���r�b�g��]�����l   n:");
	n=stdin.nextInt();
	System.out.println(lRotate(x,n));
	printBits(lRotate(x,n));
	
	
}
}
