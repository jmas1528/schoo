import java.util.Scanner;
import java.util.Arrays;
class ex3_13{
	public static void main(String[]args){
		Scanner stdin=new Scanner (System.in);
		int[] data=new int[3];
		System.out.print("®”A:");
		data[0]=stdin.nextInt();
		System.out.print("®”B:");
		data[1]=stdin.nextInt();
		System.out.print("®”C:");
		data[2]=stdin.nextInt();
		Arrays.sort(data);
		System.out.println("’†‰›’l‚Í"+data[1]+"‚Å‚·B");
	}
}