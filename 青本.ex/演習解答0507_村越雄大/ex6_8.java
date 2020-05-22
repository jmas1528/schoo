import java.util.Scanner;
class ex6_8{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("要素数：");
		int n=stdin.nextInt();
		
		double []a=new double[n];
		
		double sum=0;
		for (int i=0;i<n;i++){
			System.out.print("a["+i+"]番目の要素:");
			a[i]=stdin.nextDouble();
			sum+=a[i];
		}
		System.out.printf("合計値は%.2f\n",sum);
		System.out.printf("平均値は%.2f\n",(sum/n));
	}
}
		