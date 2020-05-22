import java.util.Scanner;
import java.util.ArrayList;
public class Earry_1 {
	
	public static void main(String[]args) {
	Scanner stdin=new Scanner(System.in);
	

	ArrayList<Double>b =inputDataUntil1000();
 
 
 System.out.print("探す値：");
 double d=stdin.nextDouble();

 
 int idx=linerSearchR(d,b);
 if(idx>=0) {
	 System.out.println("それはb["+idx+"]にあります。");
        
 }
 else 
	 System.out.println("naiyo");
 
 }
	 
 
 

	static ArrayList<Double> inputDataUntil1000() {
		Scanner stdin=new Scanner(System.in);
		ArrayList<Double>b=new ArrayList<>();
		 System.out.println("合計が1000を超えるまで入力");
		 int count=0;
		 double sum=0;
		 
		 do {
				 
			 double n=stdin.nextDouble();
			 b.add(n);
			 sum+=n;
			 count++;
			 }while(sum<=1000);		  		 
		 		 
		 System.out.println("1000を超えました");
		 return b;		 
	 }
	
	
	 static int linerSearchR(double d, ArrayList<Double> b) {
		 int idx=-1;
		 for(int i=b.size()-1;i>=0;i--) {
			 if (b.get(i)==d) {
				 idx=i;
				 
			
	 }
	}
		 return idx;
	 }
}


