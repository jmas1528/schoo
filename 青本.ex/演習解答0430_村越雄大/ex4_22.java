import java.util.Scanner;
class ex4_22{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.println("a�i�̃s���~�b�h���쐬����B");
		int a;
		do{
		
		System.out.print("�i��:");
			a=stdin.nextInt();
		}while(a<=0);
		for(int b=1;b<=a;b++){
		for(int d=a-b;d>=0;d--)
			System.out.print(" ");
			for(int c=1;c<=((b-1)*2+1);c++)
			System.out.print("*");
			System.out.println();
		}
	}
}
		