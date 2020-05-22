import java.util.Scanner;
class ex4_8{
	public static void main(String[]args){
	Scanner stdin=new Scanner(System.in);
	int a;
	do{
		System.out.print("®”’l:");
		a=stdin.nextInt();
	}while(a<=0);
	int b=1;
	int c=10;
	int d=0;
	while(b<a){
		b*=10;
		d++;
	}
		System.out.println("Œ…”‚Í"+d+"‚Å‚·B");
	}
}