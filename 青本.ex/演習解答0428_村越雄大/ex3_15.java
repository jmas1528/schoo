import java.util.Scanner;
class ex3_15{
	public static void main(String[]args){
	Scanner stdin=new Scanner(System.in);
	System.out.print("����A:");
	int a=stdin.nextInt();
	System.out.print("����B:");
	int b=stdin.nextInt();
	if (a<=b){
		int c=a;
		a=b;
		b=c;
	}
		System.out.println("a>=b�ƂȂ�悤�Ƀ\�[�X���܂����B");
		System.out.println("�ϐ�a��"+a+"�ł��B");
		System.out.println("�ϐ�b��"+b+"�ł��B");
	}
}
		