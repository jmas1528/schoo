import java.util.Scanner;
class ex2_10{
	public static void main(String[]args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("姓:");
		String a=stdIn.next();
		System.out.print("名:");
		String b=stdIn.next();
		System.out.println("こんにちは"+(a+b)+"さん。");
	}
}