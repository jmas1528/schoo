import java.util.Random;
import java.util.Scanner;
class ex4_2{
	public static void main(String[]args){
	Random rand=new Random();
	Scanner stdin=new Scanner(System.in);
	int a=rand.nextInt(89)+10;
	System.out.println("�����ăQ�[���J�n");
	System.out.println("0�`99�̐��𓖂ĂĂ��������B");
	
	int b;
	do{
		System.out.print("�������ȁH:");
		b=stdin.nextInt();
		if(b<a)
		System.out.println("�����Ƒ傫��������B");
	else if (b>a)
		System.out.println("�����Ə�����������B");
		}while(b!=a);
		System.out.println("�����ł��B");
	}
}