import java.util.Random;
class ex2_7{
	public static void main(String[]args){
		Random rand = new Random();
		int l=rand.nextInt(9)+1;
		int n=rand.nextInt(9)-9;
		int a=rand.nextInt(90)+10;
		System.out.println("���b�L�[�i���o�[��"+l+"�ł��B");
		System.out.println("�ꌅ�̕��̐����l��"+n+"�ł��B");
		System.out.println("�񌅂̐��̐����l��"+a+"�ł��B");
	}
}	