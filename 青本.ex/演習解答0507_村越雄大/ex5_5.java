import java.util.Scanner;
class ex5_5{
	public static void main(String[]args){
		Scanner stdin=new Scanner (System.in);
		System.out.println("3�̐����l����͂��Ă��������B\n���v�l�ƕ��ϒl�����߂܂��B");
		System.out.print("�����la:");int a=stdin.nextInt();
		System.out.print("�����lb:");int b=stdin.nextInt();
		System.out.print("�����lc:");int c=stdin.nextInt();
		
		int sum=a+b+c;
		int ave=(a+b+c)/3;
		
		System.out.println("���v��"+sum+"���ς�"+(double)ave+"�ł��B");
	}
}