import java.util.Scanner;
public class ex7_30 {
	static int min(int x,int y) {
		return x<y?x:y;
	}
	static int min (int x,int y, int z) {
		int min=x;
		if(min>y)min=y;
		if(min>z)min=z;
		return min;
		
	}
	static int min(int []a) {
		int min=a[0];
		for(int i=1;i<a.length;i++) 
			if(min>a[i])
				min=a[i];
			return min;
		
		
	}
public static void main(String[]args) {
	Scanner stdin=new Scanner(System.in);
	System.out.println("3�̐����l����͂��Ă��������B");
	System.out.print("x:");
	int x=stdin.nextInt();
	System.out.print("y:");
	int y=stdin.nextInt();
	System.out.print("z:");
	int z=stdin.nextInt();
	
	System.out.println("�z��a�̐ݒ���s���ĉ������B");
	System.out.print("�v�f���F");
	int n=stdin.nextInt();
	int []a=new int[n];
	for(int i=0;i<n;i++) {
		System.out.print("a["+i+"]=");
		a[i]=stdin.nextInt();
	}
	System.out.println("x��y�ł̍ŏ��l�F"+min(x,y));
	System.out.println("x,y,z�ł̍ŏ��l�F"+min(x,y,z));
	System.out.println("int a[]�ł̍ŏ��l�F"+min(a));
}
}
