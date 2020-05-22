import java.util.Scanner;
class ex6_6{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("人数:");
		int ninzu=stdin.nextInt();
		int []tensu=new int[ninzu];
		System.out.println("点数を入力してください。");
		int sum=0;
		
		for (int i=0;i<ninzu;i++){
		System.out.print((i+1)+"人目の点数:");
		tensu[i]=stdin.nextInt();
		sum+=tensu[i];
		}
		int max=tensu[0];
		for (int y=0;y<tensu.length;y++){
		if (tensu[y]>max)max=tensu[y];
		}
		int min=tensu[0];
		for (int z=0;z<tensu.length;z++){
			if (tensu[z]<min)min=tensu[z];
		}
		System.out.println("合計値は"+sum);
		System.out.println("平均値は"+((double)sum/ninzu));
		System.out.println("最高点"+max);
		System.out.println("最低点"+min);
	}
}