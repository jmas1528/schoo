import java.util.Scanner;
public class ex7_6 {
static void printSeason(int a) {
	switch(a){
		case 3:
		case 4:
		case 5:
			System.out.print("t");
			break;
		case 6:
		case 7:
		case 8:
			System.out.print("‰Ä");
			break;
		case 9:
		case 10:
		case 11:
			System.out.print("H");
			break;
		case 12:
		case 1:
		case 2:
			System.out.print("t");
			break;
			default:
			break;
			
	}
}
	public static void main(String[]args) {
		Scanner stdin=new Scanner (System.in);
		System.out.print("Œ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢F");
		int a=stdin.nextInt();
		printSeason(a);
	}
}

