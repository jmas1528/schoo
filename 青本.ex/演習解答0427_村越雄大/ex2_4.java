import java.util.Scanner;
class ex2_4{
	public static void main(String[] args){
		Scanner stdIn =new Scanner(System.in);
		System.out.print("�����l:");
		int a = stdIn.nextInt();
		int b=a+10;
		int c=a-10;
		System.out.println(a+"��10������������"+b+"�ł��B");
		System.out.println(a+"����10����������"+c+"�ł��B");
	}
}