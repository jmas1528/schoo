import java.util.Scanner;
class ex3_9{
	public static void main(String[]args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数A:");int a=stdIn.nextInt();
		System.out.print("整数B:");int b=stdIn.nextInt();
		System.out.println("大きいほうの値は"+(a<b?b:a)+"です。");
	}
}
		
		