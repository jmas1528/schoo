import java.util.Scanner;
import java.util.Random;
class ex6_11{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("óvëfêî:");
		int n=stdin.nextInt();
		int []a=new int[n];
		
		
		for (int i=0;i<n;i++){
			if (i==0)
		a[i]=rand.nextInt(10)+1;
			
			else if(i>0){
			
				Outer:while(true){
				a[i]=rand.nextInt(10)+1;
			for(int j=0;j<i;j++){
				if(a[j]==a[i]){
				continue Outer;
				}
					else if(i==j-1){
					break ;
				}
				
				
			}
					break;
			}
		}
		}
				System.out.print("{");
					for(int i=0;i<n;i++){
						if(i<n-1)
					System.out.print(a[i]+",");
						else if(i==n-1)
					System.out.print(a[i]);
				}
					System.out.print("}");
				
	}
}

		