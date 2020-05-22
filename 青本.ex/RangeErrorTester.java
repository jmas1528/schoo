import java.util.Scanner;
class RangeError extends RuntimeException {
	RangeError(int n){super("�͈͊O�̒l�F"+n);}
}
class ParameterRangeError extends RangeError{
	ParameterRangeError(int n){super(n);}
}
class ResultRangeError extends RangeError{
	ResultRangeError(int n){super(n);}
}
public class RangeErrorTester{
	static boolean isValid(int n) {
		return n>=0&& n<=9;
	}

	static int add (int a,int b)throws ParameterRangeError ,ResultRangeError{
		if(!isValid(a)) throw new ParameterRangeError (a);
		if(!isValid(b)) throw new ParameterRangeError (b);
		int result=a+b;
		if(isValid(result)) throw new ResultRangeError (result);
		return result;
	}
	public static void main (String[]args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("����a�F");int a= stdin.nextInt();
		System.out.print("�������F");int b= stdin.nextInt();

		try {
			System.out.println("�����̘a��"+add(a,b)+"�ł��B");
		}catch(RangeError e) {
			if(!isValid(a)==true|!isValid(b)==true) {
				System.out.println("�����鐔���͈͊O�ł��B"+e.getMessage());
			}if(!isValid(a+b)==true)
				System.out.println("�v�Z���ʂ��͈͊O�ł��B"+e.toString());		
		}
	}
}


