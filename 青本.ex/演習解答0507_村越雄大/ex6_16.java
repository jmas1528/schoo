import java.util.Scanner;
class ex6_16{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		int [][]a=new int[4][3];
		int [][]b=new int[3][4];
		int [][]c=new int[4][4];
		
		System.out.println("a‚Ì—v‘f");
		for(int i=0;i<4;i++)
		for(int j=0;j<3;j++){
				System.out.print("a["+i+"]["+j+"]=");
			a[i][j]=stdin.nextInt();
		}
		System.out.println();
		System.out.println("b‚Ì—v‘f");
		for(int i=0;i<3;i++)
		for(int j=0;j<4;j++){
				System.out.print("b["+i+"]["+j+"]=");
			b[i][j]=stdin.nextInt();
		}
		System.out.println();
		
		for(int i=0;i<4;i++)
		for(int j=0;j<4;j++)
		for(int y=0;y<3;y++)
		c[i][j]+=a[i][y]*b[y][j];
		System.out.println("a‚Ì—v‘f");
		for(int[] i:a){
			for(int j:i){
				System.out.printf("%5d",j);
			}
			System.out.println();
		}
		
		System.out.println("b‚Ì—v‘f");
		for(int[] i:b){
			for(int j:i){
				System.out.printf("%5d",j);
			}
			System.out.println();
		}
		System.out.println("c‚Ì—v‘f");
		for(int[] i:c){
			for(int j:i){
				System.out.printf("%5d",j);
			}
			System.out.println();
		}
	}
}
				
				
				