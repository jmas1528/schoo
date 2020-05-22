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
		System.out.print("数値a:");int a=stdin.nextInt();
		System.out.print("数値b:");int b=stdin.nextInt();
		System.out.print("数値c:");int c=stdin.nextInt();
		System.out.println("最小値は"+min(a,b,c)+"です。");
  }
}



