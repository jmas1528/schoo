import java.util.Scanner;
class ex3_1{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�����l:");
		int a=stdIn.nextInt();
		if(a>=0)
		System.out.println("���̐�Βl��"+a+"�ł��B");
		else
		System.out.println("���̐�Βl��"+(a*-1)+"�ł��B");
	}
}