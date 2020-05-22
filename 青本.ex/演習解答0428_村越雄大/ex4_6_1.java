import java.util.Scanner;
class ex4_6_1{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("‰½ŒÂ–‚ğ•\¦‚µ‚Ü‚·‚©:");
		int a=stdin.nextInt();
		int b=0;
		while (b<a){
			System.out.print('*');
			b++;
		}
		if(a>0){
		System.out.println();
		}
	}
}

