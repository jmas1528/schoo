import java.util.Scanner;
class ex3_11{
	public static void main(String[]args){
	Scanner stdin=new Scanner(System.in);
	System.out.print("整数A");int a=stdin.nextInt();
	System.out.print("整数B");int b=stdin.nextInt();
	int c=a<b?b-a:a-b;
	if (c>=11)
	System.out.println("それらの差は11以上です。");
	else 
	System.out.println("それらの差は10以下です。");
}
}