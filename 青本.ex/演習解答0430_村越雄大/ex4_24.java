import java.util.Scanner;
class ex4_24{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.println("素数であるかを判断します。");
		int a;
		do{
			System.out.print("正の整数値:");
			a=stdin.nextInt();
		}while(a<=0);
		
		for(int b=1;b<=a;b++){
			if (b==a&&a!=1){
				System.out.println("その数は素数です。");
			}
			else if(a==1){
				System.out.println("その数は素数ではありません。");
			}
				else if(a%b==0){
					System.out.println("その数は素数ではありません。");
					break;
				}
			
			}
		}
	}