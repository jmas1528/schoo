import java.util.Scanner;
class ex4_20{
	public static void main(String[]args){
		Scanner stdin=new Scanner (System.in);
		System.out.println("a�i�̐����`�����܂��B");
		System.out.print("�i��:");
		int a=stdin.nextInt();
		for (int b=1;b<=a;b++){
			for(int c=1;c<=a;c++)
			System.out.print(" *");
			System.out.println();
		}
	}
}