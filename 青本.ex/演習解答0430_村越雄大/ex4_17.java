import java.util.Scanner;
class ex4_17{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("®”’l:");
		int a=stdin.nextInt();
		int c=0;
		for(int b=1;b<=a;b++){
			if (a%b==0){
		System.out.println(b);
		c++;
		}
	}
	System.out.print("–ñ”‚Í"+c+"‚Å‚·B");
	}
}