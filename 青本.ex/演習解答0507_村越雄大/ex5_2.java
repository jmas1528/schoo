import java.util.Scanner;
class ex5_2{
	public static void main(String[]args){
		Scanner stdin=new Scanner (System.in);
		System.out.println("•Ï”x‚ÍfloatŒ^A•Ï”y‚ÍdoubleŒ^‚Å¦‚·B");
		float a;
		double b;
		do{
			System.out.println("“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
		System.out.print("x:");
		a=stdin.nextFloat();
			System.out.print("y:");
		b=stdin.nextDouble();
			}while(a<=0);
		System.out.println("x="+a);
		System.out.println("y="+b);
	}
}