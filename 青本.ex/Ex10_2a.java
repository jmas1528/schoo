import java.util.Scanner;
public class Ex10_2a {
		public static void main (String[]args) {
			Scanner stdin=new Scanner(System.in);
			
			
			Ex10_2 a=new Ex10_2();
			Ex10_2 b=new Ex10_2();
			Ex10_2 c=new Ex10_2();
			Ex10_2 d=new Ex10_2();
			 
			
			
			System.out.println("a�̎��ʔԍ��F"+a.getId());
			System.out.println("b�̎��ʔԍ��F"+b.getId());
			
			System.out.println("�ύX���܂����H1=Yes�A0=No");
			int x=stdin.nextInt();
			if (x==1) {
				System.out.print("�J�E���g�̕ύX�F");
				int n=stdin.nextInt();
			}
				
				
			
			
			System.out.println("c�̎��ʔԍ��F"+c.getId());
			System.out.println("d�̎��ʔԍ��F"+d.getId());
			
			System.out.println("Id,counter="+Ex10_2.counter);
			System.out.println("a.counter"+a.counter);
			System.out.println("b.counter"+b.counter);
			System.out.println("�Ō�̔ԍ���"+Ex10_2.getMaxId());
		}
	}


