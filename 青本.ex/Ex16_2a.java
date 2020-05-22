
public class Ex16_2a {


class RangeError extends RuntimeException {
		RangeError(int n){super("”ÍˆÍŠO‚Ì’lF"+n);}
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


	
