import java.util.Scanner;
class ex4_10{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("何個＊を表示しますか:");
		int a=stdin.nextInt();
		for(int b=0;b<a;b++){
		System.out.print("*");
		}
		if (a>0)
		System.out.println();
	}
}