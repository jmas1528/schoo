import java.util.Scanner;
class ex4_1{
	public static void main(String[]args){
	Scanner stdin=new Scanner(System.in);
	int retry;
	do {
		System.out.print("�G�߂����߂܂��B\n�����ł����H:");
		int month=stdin.nextInt();
		if (month>=3&&month<=5)
		System.out.println("����͏t�ł��B");
		else if (month>=6&&month<=8)
		System.out.println("����͉Ăł��B");
		else if (month>=9&&month<=11)
		System.out.println("����͏H�ł��B");
		else if (month==12||month==1||month==3)
		System.out.println("����͓~�ł��B");
		System.out.print("����1�x�H1�cyes/2�cNo:");
		retry=stdin.nextInt();
		}while (retry==1);
	}
}