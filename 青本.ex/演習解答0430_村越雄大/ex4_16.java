import java.util.Scanner;
class ex4_16{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		int a;
		do{
		System.out.print("何個＊を表示しますか:");
		a=stdin.nextInt();
		}while (a<=0);
		for (int b=1;b<=a;b++){
		System.out.print("*");
			if(b%5==0){
		System.out.println();
			}
		}
	}
}
		