import java.util.Scanner;
class ex3_6{
	public static void main(String[]args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("����:");
		int a=stdIn.nextInt();
		if(a>0&&a%10==0)
		System.out.println("���̒l��10�̔{���ł��B");
		else if(a>0&&a%10>=1)
		System.out.println("���̒l��10�̔{���ł͂���܂���B");
		else 
		System.out.println("���ł͂Ȃ��l�����͂���܂����B");
	}
}