import java.util.Scanner;
class ex4_6_2{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("何個＊を表示しますか:");
		int a=stdin.nextInt();
		int b=1;
		while (b<=a){
			System.out.print('*');
			b++;
		}
		if (a>0){
		System.out.println();
		}
	}
}
