import java.util.Scanner;
class ex4_21_2{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		
		System.out.println("�E�������p�̎O�p�`���o�͂��܂�");
		System.out.print("�i��:");
		int a= stdin.nextInt();
		for(int b=a;b>0;b--){
			for(int d=b;d-1>0;d--)
			System.out.print(" ");
			for(int c=0;c<=a-b;c++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}