import java.util.Scanner;
import java.util.Random;
class ex6_12{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		Random rand=new Random();
		
		System.out.print("�v�f��:");
		
		
		int n=stdin.nextInt();
		int []a=new int[n];
		System.out.println("��������͂��Ă��������B");
		for (int i=0;i<a.length;i++){
		System.out.printf("a[%d]:",i);
		a[i]=rand.nextInt(10)+1;
	}
		System.out.println("�V���b�t�����܂��B");
		int b;
		int []c=new int[n];
		for (int i=0;i<a.length;i++){
			OUter:while(true){
				b=rand.nextInt(n);
				for (int j=0;j<i;j++){
					if(c[j]==b){
						continue OUter;
					}
				}
				
			c[i]=b;
				break;
			}
			System.out.printf("a[%d]:%d\n",c[i],a[c[i]]);
		}
	}
		}
		