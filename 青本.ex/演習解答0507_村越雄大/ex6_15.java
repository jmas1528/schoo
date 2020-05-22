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
			"Œ","‰Î","…","–Ø","‹à","“y","“ú"
	};
		
		System.out.println("‰pŒê‚Ì—j“ú–¼‚ğ¬•¶š‚Å“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
	int a;
	int  b=15;
	
		Outer:while(true){
			do{
		 a=rand.nextInt(7);
			}while (a==b);
			b=a;
			inner:while(true){
		System.out.printf("%s—j“ú",youbi[a]);
				String x=stdin.next();
					if(monthString[a]==x);
		System.out.println("³‰ğ‚Å‚·B‚à‚¤ˆê“xH‚P..Yes/0..No");
			int c=stdin.nextInt();
				if(a==0){
				break Outer;
		} else if (a==1){
		continue Outer;
		}else {
			System.out.println("ˆá‚¢‚Ü‚·B");
			continue inner;
		}
			}
		}
}
}
			
		
		
		
			
			
			
		
		
		



		
		