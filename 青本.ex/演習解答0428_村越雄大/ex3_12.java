import java.util.Scanner;
class ex3_12{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("®”A:");int a=stdin.nextInt();
		System.out.print("®”B:");int b=stdin.nextInt();
		System.out.print("®”C:");int c=stdin.nextInt();
		int min=a;
		if (b<min)min=b;
		if (c<min)min=c;
		System.out.println("Å¬’l‚Í"+min+"‚Å‚·B");
	}
}