import java.util.Random;
class ex3_17{
	public static void main(String[]args){
		Random hand=new Random();int a=hand.nextInt(3);
		switch (a){
		case 0:System.out.println("�O�["); break;
		case 1:System.out.println("�`���L");break;
		case 2:System.out.println("�p�[");break;
		}
	}
}