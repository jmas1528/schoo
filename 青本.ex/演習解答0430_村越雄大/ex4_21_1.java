import java.util.Scanner;
class ex4_21{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		
		System.out.println("���㑤���p�̎O�p�`���o�͂��܂�");
		System.out.print("�i��:");
		int a= stdin.nextInt();
		for(int b=a;b>=1;b--){
			for(int c=b;c>=1;c--)
				System.out.print("*");
			System.out.println();
		}
	}
}