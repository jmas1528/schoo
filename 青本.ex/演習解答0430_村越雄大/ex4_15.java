import java.util.Scanner;
class ex4_15{
	public static void main(String[]args){
		Scanner stdin=new Scanner (System.in);
		int a;
		int b;
		int c;
		do{
		System.out.print("‰½cm‚©‚ç:");a=stdin.nextInt();
		System.out.print("‰½‡p‚Ü‚Å:");b=stdin.nextInt();
		System.out.print("‰½‡p‚²‚Æ:");c=stdin.nextInt();
		}while (b<=a&&b<=0&&c<=0);
		System.out.print("g’·");System.out.println("  •W€‘Ìd");
		
		for (int x=a;x<=b;x+=c){
			System.out.println(x+"  "+(x-100)*0.9);
		}
	}
}
		