import java.util.Scanner;
class ex5_6{
	public static void main(String[]args){
		System.out.println("float    int");
		System.out.println("--------------");
		float sum=0.0F;
		float i=0.0F;
		for (float x=0.0F;x<=1F;x+=0.001F,i++){
		float y=(float)i/1000;
			System.out.printf("%.7f    %.7f\n",x,y);
		}
	}
}