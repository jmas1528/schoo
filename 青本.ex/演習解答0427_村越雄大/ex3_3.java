import java.util.Scanner;
class ex3_3{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数:");
		int a=stdIn.nextInt();
		if(a>0)
		System.out.println("その値は正です。");
		else if(a<0)
		System.out.println("その値は負です。");
		else if(a==0)
		System.out.println("その値は0です。");
	}
}