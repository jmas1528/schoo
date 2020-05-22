import java.util.Scanner;
class ex6_18{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		int [][]c;
		
		System.out.print("行数を入力してください:");
		int a=stdin.nextInt();
		c=new int[a][];
		System.out.println();
		
		System.out.println("各行の列数を入力してください:");
		for (int i=0;i<c.length;i++){
		System.out.printf("c[%d]=",i);
		int b=stdin.nextInt();
		c[i]=new int[b];
		}
		System.out.println();
		
		System.out.println("各要素の数を入力してください:");
		for (int i=0;i<c.length;i++){
			for (int j=0;j<c[i].length;j++){
			System.out.printf("c[%d][%d]=",i,j);
			c[i][j]=stdin.nextInt();
				
		}
		}
		System.out.println("表示");
		for(int i=0;i<c.length;i++){
			for (int j=0;j<c[i].length;j++){
			System.out.printf("%3d",c[i][j]);
		}
			System.out.println();
		}
	
	}
}