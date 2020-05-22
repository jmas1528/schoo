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
			
			System.out.printf("今日は%04d年%02d月%02d日です。\n",y,m,d);
		}
		
		
		System.out.print("西暦年:");
		y=stdin.nextInt();
		System.out.println("その年は閏年"+(Ex10_4.isLeap(y)?"です。":"ではありません。"));
		
		System.out.println("日付を入力してください。");
		System.out.print("年：");y=stdin.nextInt();
		System.out.print("月：");m=stdin.nextInt();
		System.out.print("日：");d=stdin.nextInt();
		Ex10_4 a=new Ex10_4 (y,m,d);
		System.out.println(a.getYear()+"年は閏年"+(a.isLeap()?"です。":"ではありません。"));
	}
}
