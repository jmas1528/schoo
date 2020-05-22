import java.util.Scanner;
class ex6_19{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("クラス数を入力:");
		int a=stdin.nextInt();
		int [][]b=new int[a][];
		System.out.println();
		
		int c=0;
		for (int i=0;i<b.length;i++){
			System.out.printf("%d組の人数:",i+1);
			int d=stdin.nextInt();
			c+=d;
			for(int j=0;j<b[i].length;d++){
				System.out.printf("%d組%d番目の生徒の点数:",i+1,j+1);
				b[i][j]=stdin.nextInt();
			}
			System.out.println();
		}
			int []sum=new int[b.length];
			double []ave=new double[b.length];
			System.out.println("  組 |	合計  平均 ");
			System.out.println("-------------------");
			for (int i=0;i<b.length;i++){
				for(int j=0;j<b[i].length;j++){
					sum[i]+=b[i][j];
					ave[i]=sum[i]/(double)b[i].length;
				}
				System.out.printf("%2d組 |%7d %6.1f\n",i+1,sum[i],ave[i]);
			}
				int alls=0;
				for (int i=0;i<b.length;i++){
				      alls+=sum[i];
				}
				double alla=(double)alls/c;
				System.out.println("-------------------");
				System.out.printf(" 計 |%7d %6.1f\n",alls,alla);
			}
}
			
				
			
			
			
			
			
			
			