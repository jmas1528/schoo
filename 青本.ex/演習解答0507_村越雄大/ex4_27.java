import java.util.Random;
import java.util.Scanner;
class ex4_27{
	public static void main(String[]args){
	Random rand=new Random();
	Scanner stdin=new Scanner(System.in);
	int a=rand.nextInt(100);
	System.out.println("�����ăQ�[���J�n");
	System.out.println("0�`99�̐��𓖂ĂĂ��������B");
	int b=100;
	Outer:
		
		for (int i=10;i>0;i--){
			System.out.println("��"+i+"��I");
		System.out.print("�������ȁH:");
		b=stdin.nextInt();
			
			if (b==a){
			System.out.println("�����ł�!");
			break Outer;
			}
			else if (i==1&&b!=a){
			System.out.println("������"+a+"�ł����B");
			break Outer;
			}
			 
			else if(b<a&&i!=1){
		System.out.println("�����Ƒ傫��������B");
			}
			else if (b>a&&i!=1){
		System.out.println("�����Ə�����������B");
			}
			}
		}
}
	
		
