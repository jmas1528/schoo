import java.util.Scanner;
class ex5_2{
	public static void main(String[]args){
		Scanner stdin=new Scanner (System.in);
		System.out.println("変数xはfloat型、変数yはdouble型で示す。");
		float a;
		double b;
		do{
			System.out.println("入力してください。");
		System.out.print("x:");
		a=stdin.nextFloat();
			System.out.print("y:");
		b=stdin.nextDouble();
			}while(a<=0);
		System.out.println("x="+a);
		System.out.println("y="+b);
	}
}