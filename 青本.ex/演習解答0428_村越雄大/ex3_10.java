import java.util.Scanner;
class ex3_10{
	public static void main(String[]args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("����A:");int a=stdIn.nextInt();
		System.out.print("����B:");int b=stdIn.nextInt();
		System.out.println("�傫���ق��̒l��"+(a<b?b-a:a-b)+"�ł��B");
	}
}