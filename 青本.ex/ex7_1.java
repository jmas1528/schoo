
import java.util.Scanner;
 class ex7_1 {
  public static void main(String[]args) {
	  Scanner stdin=new Scanner (System.in);
	System.out.println("���l�F");
	int n=stdin.nextInt();
	int a=sign0f(n);
	System.out.println(a);
	}

 static int sign0f(int n) {
	// TODO �����������ꂽ���\�b�h�E�X�^�u
	 int y=0;
	 if(n==0) {
		 y=0;
	 }else if(n<0) {
		 y=-1;
	 }else { 
		 y=1;
	 }
	return y;
}
  }

