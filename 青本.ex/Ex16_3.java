import java.util.Scanner;
 class Ex16_3 {
	 static void swap(int[]a,int idx1,int idx2) {
		 int t=a[idx1];
		 a[idx1]=a[idx2];
		 a[idx2]=t;
	 }
	 
	 static void reverse(int[]a) {
		 try {
			 for(int i=0;i<a.length/2; i++) 
				 swap(a,i,a.length-i);
		 }catch(ArrayIndexOutOfBoundsException e) {
			 e.printStackTrace();
			 System.exit(1);			 
		 }
	 }
	 public static void main(String[]args) {
		 Scanner stdin=new Scanner(System.in);
		 System.out.print("—v‘f”F");
		 int num=stdin.nextInt();
		 int[]x=new int[num];
		 
		 for (int i=0;i<num;i++) {
			 System.out.print("x["+i+"]:");
			 x[i]=stdin.nextInt();
		 }
		 reverse(x);
		 
		 System.out.println("—v‘f‚Ì•À‚Ñ‚ð”½“]‚µ‚Ü‚µ‚½B");
		 for(int i=0;i<num;i++)
			 System.out.println("x["+i+"]="+x[i]);
	 }
 }

