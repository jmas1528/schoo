import java.util.Scanner;
class ex4_25_1{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.println("�����̍��v�l�ƕ��ϒl�����߂܂��B");
		System.out.print("�����͂��܂���:");
		int n=stdin.nextInt();
		
		int sum=0;
		int c=0;
		for(int i=0;i<n;i++){
			System.out.print("�����i0�ŏI���j");
			int t=stdin.nextInt();
			if(t==0){ break;}
			sum+=t;
		    c++;
		}
		double a =((double)sum/c);
		System.out.println("���v��"+sum+"�A���ς�"+a+"�ł��B");
	}
}

		