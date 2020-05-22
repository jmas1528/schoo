import java.util.Scanner;

public class ex7_13 {
	static void printBits(int x ){
		for(int i=31;i>=0;i--) {
			System.out.print((x>>>i&1)==1?"1":"0");
		}		
	}
	static int set(int x, int pos) {
		int a=0;
		if(pos==0) {
			
			x=x|1;
			return x;
		}else if(pos==31) {		
			x=-2147483648|x;
			return x;
		}else {
			a=1;
			for(int i=0;i<pos;i++) {
				a*=2;
				
			}
			x=x|a;
			return x;
		}	
	}
 static int reset(int x,int pos) {
	 int a=0;
	 if(pos==0) {
		 a=1;
		 a=~a;
		 x=x&a;
		 return x;
	 }else if(pos==31) {
		 a=-2147483648;
		 a=~a;
		 x=x&a;
		 return x;
	 }else {
	 a=1;
	 for(int i=0;i<pos;i++) {
		 a*=2;
	 }a=~a;
	 x=x&a;
	 return x;
	 }
 }
 static int inverse(int x,int pos) {
	 
 }
 
	public static void main(String[]args) {
		Scanner stdin=new Scanner(System.in);
		
		System.out.print("整数：");
		int x=stdin.nextInt();
		System.out.print("ビット数：");
		printBits(x);
		
		
		System.out.println("");
		System.out.print("posビット目を１にした値　pos:");
		int pos=stdin.nextInt();
		System.out.print("");
		System.out.println(set(x,pos));
		printBits(set(x,pos));
		
		System.out.print("posビット目を0にした値　pos:");
		 pos=stdin.nextInt();
		System.out.print("");
		System.out.println(reset(x,pos));
		printBits(reset(x,pos));
		
		System.out.print("posビット目を反転した値 pos:");
		pos=stdin.nextInt();
		System.out.print("");
		System.out.println(inverse(x,pos));
		printBits(inverse(x,pos));
}
}
