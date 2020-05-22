import java.util.Scanner;
public class Ex7_31 {
	static int absolute(int x) {
		return (x<0)?-x:x;
	}
	static long absolute(long x) {
		return (x<0)?-x:x;
	}
	static float absolute(float x) {
		return (x<0)?-x:x;
	}
	static double absolute(double x) {
		return (x<0)?-x:x;
	}
	public static void main(String[]args) {
		Scanner stdin=new Scanner(System.in);
		System.out.println("ｘを入力してください。");
		System.out.print("x:");
		int x=stdin.nextInt();
		System.out.println("小数ｘを入力してください。");
		System.out.print("ｙ:");
		float y=stdin.nextFloat();
		System.out.print("ｘの絶対値は：");
		System.out.println(absolute(x));
		System.out.print("yの絶対値は：");
		System.out.println(absolute(y));
	}
}
