import java.util.Scanner;
public final class Ex10_3 {
	public static int Ex10_3a(int x,int y) {
		return x<y?x:y;
	}
	public static int min (int x,int y, int z) {
		int min=x;
		if(min>y)min=y;
		if(min>z)min=z;
		return min;
		
	}
	public static int min(int []a) {
		int min=a[0];
		for(int i=1;i<a.length;i++) 
			if(min>a[i])
				min=a[i];
			return min;
		
		
	}
	 
}


