import java.util.Scanner;
class ex4_25_2{
	public static void main(String[]args){
		Scanner stdin=new Scanner (System.in);
		System.out.println("�����̍��v�l�ƕ��ϒl�����߂܂��B");
		System.out.print("�����͂��܂���:");
		int n=stdin.nextInt();
		
		int sum=0;
		int c=0;
		for(int i=0;i<n;i++){
			System.out.print("����:");
			int t=stdin.nextInt();
			if(sum+t>1000){
				System.out.println("���v��1000�𒴂��܂����B");
				System.out.println("�Ō�̐��l�͖������܂��B");
				break;
			}
			sum+=t;
			c++;
		}
		double a=((double)sum/c);
		System.out.print("���v��"+sum+"�A���ς�"+a+"�ł��B");
	}
}