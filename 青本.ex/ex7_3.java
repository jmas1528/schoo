import java.util.Scanner;
public class ex7_3 {
	static int naka (int a,int b,int c) {
int max=a;
int naka=a;
int min=a;
		if(b<min) {
		   min=b;
		}else if(b>max) {
			max=b;
		}
		if(c<min) {
			   min=c;
			}else if(c>max) {
				max=c;
			}
		if (b!=max&&b!=min) {
			naka=b;
		}
		if (c!=max&&c!=min) {
			naka=c;
		}
		return naka;
	}
		
		
	public static void main(String[]args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("���la:");int a=stdin.nextInt();
		System.out.print("���lb:");int b=stdin.nextInt();
		System.out.print("���lc:");int c=stdin.nextInt();
		System.out.println("�����l��"+naka(a,b,c)+"�ł��B");
  }
}


