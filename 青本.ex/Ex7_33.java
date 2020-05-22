import java.util.Scanner;
public class Ex7_33 {
	static void printArray(int a[]) {
		for(int i=0;i<a.length;i++)
			if(i==0) {
			System.out.print(a[i]);
			}else {
				System.out.print(" "+a[i]);
			}
		System.out.println();
	}
	
	static void printArray(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) 
			System.out.print(a[i][j]+" ");
			System.out.println();
			
		}
	}
public static void main(String[]args) {
	Scanner stdin=new Scanner(System.in);
	System.out.print("—v‘f”F");
	int n=stdin.nextInt();
	int []a=new int[n];
	
	System.out.print("—v‘f”F");
	int m=stdin.nextInt();
	int [][]b=new int[4][m];
	
	printArray(a);
	printArray(b);
}
}
