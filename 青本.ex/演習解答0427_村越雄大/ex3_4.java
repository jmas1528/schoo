import java.util.Scanner;
class ex3_4{
	public static void main(String[]args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("����A:");
		int a=stdIn.nextInt();
		System.out.print("����B:");
		int b=stdIn.nextInt();
		if(a>b)
		System.out.println("A�̂ق����傫���ł��B");
		else if(a<b)
		System.out.println("B�̂ق����傫���ł��B");
		else
		System.out.println("A��B�͓����l�ł��B");
	}
}
		 