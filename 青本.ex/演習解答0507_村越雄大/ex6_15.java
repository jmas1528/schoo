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
			"��","��","��","��","��","�y","��"
	};
		
		System.out.println("�p��̗j�������������œ��͂��Ă��������B");
	int a;
	int  b=15;
	
		Outer:while(true){
			do{
		 a=rand.nextInt(7);
			}while (a==b);
			b=a;
			inner:while(true){
		System.out.printf("%s�j��",youbi[a]);
				String x=stdin.next();
					if(monthString[a]==x);
		System.out.println("�����ł��B������x�H�P..Yes/0..No");
			int c=stdin.nextInt();
				if(a==0){
				break Outer;
		} else if (a==1){
		continue Outer;
		}else {
			System.out.println("�Ⴂ�܂��B");
			continue inner;
		}
			}
		}
}
}
			
		
		
		
			
			
			
		
		
		



		
		