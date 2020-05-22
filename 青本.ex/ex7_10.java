import java.util.Scanner;
import java.util.Random;
public class ex7_10 {
static Scanner stdin=new Scanner(System.in);
static boolean confirmRetry() {
	int cont;
	
	do {
		System.out.print("もう一度？<yes..1 no..0>:");
		cont=stdin.nextInt();
	}while(cont!=0&&cont!=1);
	return cont==1;
	}
public static void main(String[]args) {
	Random rand=new Random();
	System.out.println("暗算力トレーニング");
	do {
		int w=rand.nextInt(4);
		int x=rand.nextInt(900)+100;
		int y=rand.nextInt(900)+100;
		int z=rand.nextInt(900)+100;
		
		Outer:while(true) {
			switch(w) {
			case 0:
				System.out.print(x+"+"+y+"+"+z+"=");
				break;
			case 1:
				System.out.print(x+"+"+y+"-"+z+"=");
				break;
			case 2:
				System.out.print(x+"-"+y+"+"+z+"=");
				break;
			case 3:
				System.out.print(x+"-"+y+"-"+z+"=");
				break;
			}
			int a=stdin.nextInt();
			switch(w) {
			case 0:
				if(a==x+y+z) {
					break Outer;
			}else {
				break;
			}
			case 1:
				if(a==x+y+z) {
					break Outer;
			}else {
				break;
			}
			case 2:
				if(a==x+y+z) {
					break Outer;
			}else {
				break;
			}
			case 3:
				if(a==x+y+z) {
					break Outer;
			}else {
				break;
			}
		}
			System.out.println("違いますよ");
	}
	}while(confirmRetry());
	
	
}
}
