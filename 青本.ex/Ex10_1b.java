import java.util.Scanner;
public class Ex10_1b {
	public static void main (String[]args) {
		Ex10__1 a=new Ex10__1();
		Ex10__1 b=new Ex10__1();
		
		System.out.println("a�̎��ʔԍ��F"+a.getId());
		System.out.println("b�̎��ʔԍ��F"+b.getId());
		
		
		System.out.println("Id,counter="+Ex10__1.counter);
		System.out.println("a.counter"+a.counter);
		System.out.println("b.counter"+b.counter);
		System.out.println("�Ō�̔ԍ���"+Ex10__1.getMaxId());
	}
}
