import java.util.Scanner;
class ex5_1{
	public static void main(String[]args){
		Scanner stdin=new Scanner (System.in);
		int a;
		do{
			System.out.println("��������͂��Ă��������B");
		System.out.print("����:");
		a=stdin.nextInt();
			}while(a<=0);
		
		
		System.out.printf("�W�i���ŕ\����%o�ł��B\n",a);
		System.out.printf("16�i���ŕ\����%x�ł��B\n",a); 
		
	}
} 