import java.util.Scanner;
class ex3_8	{
	public static void main(String[]args){
	Scanner stdIn=new Scanner (System.in);
	System.out.print("“_”:");
	int a=stdIn.nextInt();
	if(a>=0&&a<=59)
	System.out.println("•s‰Â");
	else if(a>=60&&a<=69)
	System.out.println("‰Â");
	else if (a>=70&&a<=79)
	System.out.println("—Ç");
	else
	System.out.println("—D");
	}
}
	