import java.util.Scanner;
public class ex7_6 {
static void printSeason(int a) {
	switch(a){
		case 3:
		case 4:
		case 5:
			System.out.print("春");
			break;
		case 6:
		case 7:
		case 8:
			System.out.print("夏");
			break;
		case 9:
		case 10:
		case 11:
			System.out.print("秋");
			break;
		case 12:
		case 1:
		case 2:
			System.out.print("春");
			break;
			default:
			break;
			
	}
}
	public static void main(String[]args) {
		Scanner stdin=new Scanner (System.in);
		System.out.print("月を入力してください：");
		int a=stdin.nextInt();
		printSeason(a);
	}
}

