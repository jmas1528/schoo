import java.util.Scanner;
public class Ex16_1 {
static void check(int sw)throws Exception{
	switch (sw) {
	case 1:throw new Exception("åüç∏ó·äOî≠ê∂");
	case 2:throw new RuntimeException("îÒåüç∏ó·äOî≠ê∂");
	
}
}

static void test(int sw)throws Exception{
	check(sw);
}

public static void main(String[]args) {
	Scanner stdin=new Scanner(System.in);
	
	System.out.print("sw:");
	int sw= stdin.nextInt();
	
	try {
		test(sw);
	}catch (RuntimeException e) {
		System.out.println(e.getMessage());
	}
     catch(Exception e) {
    	 System.out.println(e.getMessage());
     }
	}
}
