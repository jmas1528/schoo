import java.util.Scanner;
class ex3_5{
	public static void main(String[]args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("����:");
		int a=stdIn.nextInt();
		if(a>0&&a%5==0)
		System.out.println("���̒l��5�Ŋ���؂�܂��B");
		else if(a>0&&a%5>=1)
		System.out.println("���̒l��5�Ŋ���؂�܂���B");
		else 
		System.out.println("���ł͂Ȃ��l�����͂���܂����B");
	}
}