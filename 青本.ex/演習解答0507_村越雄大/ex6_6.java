import java.util.Scanner;
class ex6_6{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		System.out.print("�l��:");
		int ninzu=stdin.nextInt();
		int []tensu=new int[ninzu];
		System.out.println("�_������͂��Ă��������B");
		int sum=0;
		
		for (int i=0;i<ninzu;i++){
		System.out.print((i+1)+"�l�ڂ̓_��:");
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
		System.out.println("���v�l��"+sum);
		System.out.println("���ϒl��"+((double)sum/ninzu));
		System.out.println("�ō��_"+max);
		System.out.println("�Œ�_"+min);
	}
}