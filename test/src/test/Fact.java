package test;

public class Fact {

	public static void main(String[] args) {
		int i=1;
		int fact1=1;
		while (i<=5) {
			fact1=fact1*i;
			i++;
		}
		System.out.println(fact1);
	}

}
