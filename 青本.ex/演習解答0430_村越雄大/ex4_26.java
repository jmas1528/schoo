import java.util.Scanner;
class ex4_26{
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
			if(t<0){
				System.out.println("���̐��͉��Z���܂���B");
				continue;
			}
			sum+=t;
			c++;
		}
		double a=((double)sum/c);
		System.out.print("���v��"+sum+"�A���ς�"+a+"�ł��B");
	}
}