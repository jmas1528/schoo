import java.util.Random;
import java.util.Scanner;
class ex2_8{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�����l:");
		int a=stdIn.nextInt();
		Random rand= new Random();
		int l=rand.nextInt(11)-5;
		System.out.println("�����l"+a+"��+-5�̗����𐶐����܂����B");
		System.out.println("�����"+(l+a)+"�ł��B");
	}
}
		