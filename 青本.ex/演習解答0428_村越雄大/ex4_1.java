import java.util.Scanner;
class ex4_1{
	public static void main(String[]args){
	Scanner stdin=new Scanner(System.in);
	int retry;
	do {
		System.out.print("季節を求めます。\n何月ですか？:");
		int month=stdin.nextInt();
		if (month>=3&&month<=5)
		System.out.println("それは春です。");
		else if (month>=6&&month<=8)
		System.out.println("それは夏です。");
		else if (month>=9&&month<=11)
		System.out.println("それは秋です。");
		else if (month==12||month==1||month==3)
		System.out.println("それは冬です。");
		System.out.print("もう1度？1…yes/2…No:");
		retry=stdin.nextInt();
		}while (retry==1);
	}
}