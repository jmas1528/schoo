import java.util.Scanner;
class ex5_2{
	public static void main(String[]args){
		Scanner stdin=new Scanner (System.in);
		System.out.println("�ϐ�x��float�^�A�ϐ�y��double�^�Ŏ����B");
		float a;
		double b;
		do{
			System.out.println("���͂��Ă��������B");
		System.out.print("x:");
		a=stdin.nextFloat();
			System.out.print("y:");
		b=stdin.nextDouble();
			}while(a<=0);
		System.out.println("x="+a);
		System.out.println("y="+b);
	}
}