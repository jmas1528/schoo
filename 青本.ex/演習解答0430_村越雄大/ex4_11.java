import java.util.Scanner;
class ex4_11{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.println("�J�E���g�_�E�����܂��B");
		int a;
		do{
			System.out.print("���̐����l:");
			a=stdin.nextInt();
		}while (a<=0);
		for(int b=a;b>=0;b--)
		System.out.println(b);
	}
}