import java.util.Scanner;
class ex4_13{
	public static void main(String[]args){
		Scanner stdin=new Scanner (System.in);
		System.out.println("1����A�܂ł̘a�����߂܂��B");
		int a;
		do{
			System.out.print("�����lA:");
			a=stdin.nextInt();
		}while(a<=0);
		int b=0;
		for (int c=1;c<=a;c++)
		b+=c;
		System.out.println("1����"+a+"�̍��v��"+b+"�ł��B");
	}
}
		
		