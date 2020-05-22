import java.util.Scanner;
class ex3_11{
	public static void main(String[]args){
	Scanner stdin=new Scanner(System.in);
	System.out.print("®”A");int a=stdin.nextInt();
	System.out.print("®”B");int b=stdin.nextInt();
	int c=a<b?b-a:a-b;
	if (c>=11)
	System.out.println("‚»‚ê‚ç‚Ì·‚Í11ˆÈã‚Å‚·B");
	else 
	System.out.println("‚»‚ê‚ç‚Ì·‚Í10ˆÈ‰º‚Å‚·B");
}
}