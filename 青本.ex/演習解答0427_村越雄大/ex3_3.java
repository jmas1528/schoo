import java.util.Scanner;
class ex3_3{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("����:");
		int a=stdIn.nextInt();
		if(a>0)
		System.out.println("���̒l�͐��ł��B");
		else if(a<0)
		System.out.println("���̒l�͕��ł��B");
		else if(a==0)
		System.out.println("���̒l��0�ł��B");
	}
}