import java.util.Scanner;
class ex6_19{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("�N���X�������:");
		int a=stdin.nextInt();
		int [][]b=new int[a][];
		System.out.println();
		
		int c=0;
		for (int i=0;i<b.length;i++){
			System.out.printf("%d�g�̐l��:",i+1);
			int d=stdin.nextInt();
			c+=d;
			for(int j=0;j<b[i].length;d++){
				System.out.printf("%d�g%d�Ԗڂ̐��k�̓_��:",i+1,j+1);
				b[i][j]=stdin.nextInt();
			}
			System.out.println();
		}
			int []sum=new int[b.length];
			double []ave=new double[b.length];
			System.out.println("  �g |	���v  ���� ");
			System.out.println("-------------------");
			for (int i=0;i<b.length;i++){
				for(int j=0;j<b[i].length;j++){
					sum[i]+=b[i][j];
					ave[i]=sum[i]/(double)b[i].length;
				}
				System.out.printf("%2d�g |%7d %6.1f\n",i+1,sum[i],ave[i]);
			}
				int alls=0;
				for (int i=0;i<b.length;i++){
				      alls+=sum[i];
				}
				double alla=(double)alls/c;
				System.out.println("-------------------");
				System.out.printf(" �v |%7d %6.1f\n",alls,alla);
			}
}
			
				
			
			
			
			
			
			
			