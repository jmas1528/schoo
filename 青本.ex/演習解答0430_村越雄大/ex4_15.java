import java.util.Scanner;
class ex4_15{
	public static void main(String[]args){
		Scanner stdin=new Scanner (System.in);
		int a;
		int b;
		int c;
		do{
		System.out.print("何cmから:");a=stdin.nextInt();
		System.out.print("何�pまで:");b=stdin.nextInt();
		System.out.print("何�pごと:");c=stdin.nextInt();
		}while (b<=a&&b<=0&&c<=0);
		System.out.print("身長");System.out.println("  標準体重");
		
		for (int x=a;x<=b;x+=c){
			System.out.println(x+"  "+(x-100)*0.9);
		}
	}
}
		