import java.util.Scanner;
class ex4_14{
	public static void main(String[]args){
		Scanner stdin=new Scanner (System.in);
		System.out.println("1‚©‚çA‚Ü‚Å‚Ì˜a‚ğ‹‚ß‚Ü‚·B");
		int a;
		do{
			System.out.print("®”’lA:");
			a=stdin.nextInt();
		}while(a<=0);
		int b=0;
		for (int c=1;c<=a;c++){
		b+=c;
			System.out.print(c);
			if (c!=a)
			System.out.print("+");
		}
		System.out.println("="+b);
	}
}
		
		