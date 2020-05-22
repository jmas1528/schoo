import java.util.Scanner;
class ex5_1{
	public static void main(String[]args){
		Scanner stdin=new Scanner (System.in);
		int a;
		do{
			System.out.println("整数を入力してください。");
		System.out.print("整数:");
		a=stdin.nextInt();
			}while(a<=0);
		
		
		System.out.printf("８進数で表すと%oです。\n",a);
		System.out.printf("16進数で表すと%xです。\n",a); 
		
	}
} 