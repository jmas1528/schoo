import java.util.Scanner;
class ex3_7{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�����l:");
		int a=stdIn.nextInt();
		if(a>0&&a%3==0)
		System.out.println("���̒l��3�Ŋ���؂�܂��B");
		else if(a>0&&a%3==1)
		System.out.println("���̒l��3�Ŋ������]���1�ł��B");
		else if(a>0&&a%3==2)
		System.out.println("���̒l��3�Ŋ������]���2�ł��B");
		else
		System.out.println("���ł͂Ȃ��l�����͂���܂����B");
	}
}