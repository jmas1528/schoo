import java.util.Scanner;
class ex7_2 {
  
	static int min (int a,int b,int c) {
		int min= a;
		if(b<min)min=b;
		if(c<min)min=c;
		return min;
	}
	public static void main(String[]args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("���la:");int a=stdin.nextInt();
		System.out.print("���lb:");int b=stdin.nextInt();
		System.out.print("���lc:");int c=stdin.nextInt();
		System.out.println("�ŏ��l��"+min(a,b,c)+"�ł��B");
  }
}



