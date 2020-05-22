import java.util.Scanner;
class ex4_7{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("‰½ŒÂ•\¦‚µ‚Ü‚·‚©B");
		int a=stdin.nextInt();
		int b=1;
		while(b<=a){
			System.out.print(b%2==0?"*":"+");
			b++;
		}
	}
}