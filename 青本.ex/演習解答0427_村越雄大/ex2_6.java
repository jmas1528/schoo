import java.util.Scanner;
class ex2_6{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.println("三角形の面積を求めます。");
		System.out.print("底辺の値:");
		double x=stdIn.nextDouble();
		System.out.print("高さの値:");double y=stdIn.nextDouble();
		System.out.print("面積は"+(x*y)/2+"です。");
	}
}