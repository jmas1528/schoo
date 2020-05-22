import java.util.Scanner;
import java.util.Random;
class ex6_14{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		Random rand=new Random();
		String[] monthString={
			"January","February","March","April","May","June","July","August","September","October","November","December"
		};
		Outer:while(true){
		int month=rand.nextInt(12);
		System.out.println("問題は"+monthString[month]);
		while(true){
			System.out.print("何月かな:");
			int m=stdin.nextInt();
			if(m==month+1)break;
			System.out.println("違います。");
		}
		System.out.println("正解です。もう一度？１..Yes/0..No");
		int a=stdin.nextInt();
			if (a==1){
		continue Outer;
			}
			else if(a==0){
				break;
		}
		
		
		}
}
}
			
		