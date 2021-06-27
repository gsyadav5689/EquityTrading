package test;

public class fact2 {

	public static void main(String[] args) {
		System.out.println("factorial of given number= " +fact3(5));

		}
	public static int fact3 (int num) {
		int result=1;
		for(int i=1;i<=num;i++) {
			result=result*i;
		}
			return result;
	}

	}


