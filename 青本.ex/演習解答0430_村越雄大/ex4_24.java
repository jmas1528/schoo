import java.util.Scanner;
class ex4_24{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.println("�f���ł��邩�𔻒f���܂��B");
		int a;
		do{
			System.out.print("���̐����l:");
			a=stdin.nextInt();
		}while(a<=0);
		
		for(int b=1;b<=a;b++){
			if (b==a&&a!=1){
				System.out.println("���̐��͑f���ł��B");
			}
			else if(a==1){
				System.out.println("���̐��͑f���ł͂���܂���B");
			}
				else if(a%b==0){
					System.out.println("���̐��͑f���ł͂���܂���B");
					break;
				}
			
			}
		}
	}