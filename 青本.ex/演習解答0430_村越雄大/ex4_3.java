import java.util.Scanner;
class ex4_3{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("®”A:");
		int a=stdin.nextInt();
		System.out.print("®”B:");
		int b=stdin.nextInt();
		
		if(a<=b){
			int x=a;
			a=b;
			b=x;
		}
		while(b<=a){
			System.out.print(","+b);
			b++;
		}
	}
}
		
		