import java.util.Scanner;
class ex4_18{
	public static void main(String[]args){
		Scanner stdin=new Scanner (System.in);
		int a;
		do{
		System.out.print("a‚Ì’l:");
		a=stdin.nextInt();
		}while(a<=0);
		int c=1;
		for(int b=1;b<=a;b++){
		c=b*b;
		System.out.println(b+"‚Ì2æ‚Í"+c+"‚Å‚·B");
		}
	}
}