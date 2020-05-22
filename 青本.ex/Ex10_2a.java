import java.util.Scanner;
public class Ex10_2a {
		public static void main (String[]args) {
			Scanner stdin=new Scanner(System.in);
			
			
			Ex10_2 a=new Ex10_2();
			Ex10_2 b=new Ex10_2();
			Ex10_2 c=new Ex10_2();
			Ex10_2 d=new Ex10_2();
			 
			
			
			System.out.println("aの識別番号："+a.getId());
			System.out.println("bの識別番号："+b.getId());
			
			System.out.println("変更しますか？1=Yes、0=No");
			int x=stdin.nextInt();
			if (x==1) {
				System.out.print("カウントの変更：");
				int n=stdin.nextInt();
			}
				
				
			
			
			System.out.println("cの識別番号："+c.getId());
			System.out.println("dの識別番号："+d.getId());
			
			System.out.println("Id,counter="+Ex10_2.counter);
			System.out.println("a.counter"+a.counter);
			System.out.println("b.counter"+b.counter);
			System.out.println("最後の番号は"+Ex10_2.getMaxId());
		}
	}


