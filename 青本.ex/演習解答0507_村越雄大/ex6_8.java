import java.util.Scanner;
class ex6_8{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("�v�f���F");
		int n=stdin.nextInt();
		
		double []a=new double[n];
		
		double sum=0;
		for (int i=0;i<n;i++){
			System.out.print("a["+i+"]�Ԗڂ̗v�f:");
			a[i]=stdin.nextDouble();
			sum+=a[i];
		}
		System.out.printf("���v�l��%.2f\n",sum);
		System.out.printf("���ϒl��%.2f\n",(sum/n));
	}
}
		