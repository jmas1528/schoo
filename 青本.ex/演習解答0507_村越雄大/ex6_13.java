import java.util.Scanner;
class ex6_13{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("—v‘f”F");
		int n=stdin.nextInt();
		int []a=new int[n];
		int []b=new int[n];
		for (int i=0;i<n;i++){
			System.out.print("a["+i+"]=");
		a[i]=stdin.nextInt();
		}
		int j=n-1;
		for (int i=0;i<n;i++){
		b[j]=a[i];
		j--;
		}
		for (int i=0;i<n;i++){
		System.out.println("b["+i+"]="+b[i]);
		}
	}
} 