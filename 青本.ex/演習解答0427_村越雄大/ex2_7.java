import java.util.Random;
class ex2_7{
	public static void main(String[]args){
		Random rand = new Random();
		int l=rand.nextInt(9)+1;
		int n=rand.nextInt(9)-9;
		int a=rand.nextInt(90)+10;
		System.out.println("ラッキーナンバーは"+l+"です。");
		System.out.println("一桁の負の整数値は"+n+"です。");
		System.out.println("二桁の正の整数値は"+a+"です。");
	}
}	