package test;

public class fact1 {

	public static void main(String[] args) {
		System.out.println("factorials of given number= " +fact2(6));

	}
public static int fact2 (int num) {
	int result=1;
	while (num!=0) {
		result=result*num;
		num--;
	}
		return result;
}
}
