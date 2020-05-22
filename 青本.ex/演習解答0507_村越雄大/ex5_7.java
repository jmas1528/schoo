import java.util.Scanner;
class ex5_7{
	public static void main(String[]args){
		System.out.println("float    2æ");
		System.out.println("--------------");
		
		
		for (float x=0.0F;x<=1F;x+=0.001F){
			float y=x*x;
			System.out.printf("%.7f     %.7f\n",x,y);
		}
	}
}
			