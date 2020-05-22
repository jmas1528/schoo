import java.util.Scanner;
class ex4_26{
	public static void main(String[]args){
		Scanner stdin=new Scanner (System.in);
		System.out.println("整数の合計値と平均値を求めます。");
		System.out.print("何個入力しますか:");
		int n=stdin.nextInt();
		
		int sum=0;
		int c=0;
		for(int i=0;i<n;i++){
			System.out.print("整数:");
			int t=stdin.nextInt();
			if(t<0){
				System.out.println("負の数は加算しません。");
				continue;
			}
			sum+=t;
			c++;
		}
		double a=((double)sum/c);
		System.out.print("合計は"+sum+"、平均は"+a+"です。");
	}
}