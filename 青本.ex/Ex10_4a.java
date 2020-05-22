import java.util.Scanner;
import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;
public class Ex10_4a {
	public static void main (String[]args) {
		Scanner stdin=new Scanner(System.in);
		
		static {
			GregorianCalendar today=new GregorianCalendar();
			int y=today.get(YEAR);
			int m=today.get(MONTH)+1;
			int d=today.get(DATE);
			
			System.out.printf("������%04d�N%02d��%02d���ł��B\n",y,m,d);
		}
		
		
		System.out.print("����N:");
		y=stdin.nextInt();
		System.out.println("���̔N�͉[�N"+(Ex10_4.isLeap(y)?"�ł��B":"�ł͂���܂���B"));
		
		System.out.println("���t����͂��Ă��������B");
		System.out.print("�N�F");y=stdin.nextInt();
		System.out.print("���F");m=stdin.nextInt();
		System.out.print("���F");d=stdin.nextInt();
		Ex10_4 a=new Ex10_4 (y,m,d);
		System.out.println(a.getYear()+"�N�͉[�N"+(a.isLeap()?"�ł��B":"�ł͂���܂���B"));
	}
}
