import java.util.Scanner;
import java.util.Random;
class ex6_15{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		Random rand=new Random();
		String[] monthString={
			"monday","tuesday","wednesday","thursday","friday","saturday","sunday"
		};
		String[] youbi={
			"月","火","水","木","金","土","日"
	};
		
		System.out.println("英語の曜日名を小文字で入力してください。");
	int a;
	int  b=15;
	
		Outer:while(true){
			do{
		 a=rand.nextInt(7);
			}while (a==b);
			b=a;
			inner:while(true){
		System.out.printf("%s曜日",youbi[a]);
				String x=stdin.next();
					if(monthString[a]==x);
		System.out.println("正解です。もう一度？１..Yes/0..No");
			int c=stdin.nextInt();
				if(a==0){
				break Outer;
		} else if (a==1){
		continue Outer;
		}else {
			System.out.println("違います。");
			continue inner;
		}
			}
		}
}
}
			
		
		
		
			
			
			
		
		
		



		
		