package test;

public class methods1 {

	public static void main(String[] args) {
	add(5,6);
	sub(9,6);
	methods1 m1=new methods1();
	System.out.println(m1.mul(5, 4));
	methods1 m2=new methods1();
	System.out.println(m2.div1(12, 4));
	}
    public static void add(int a,int b) {
    	int sum=a+b;
    	System.out.println(sum);
    }
    public static void sub(int a,int b) {
    	int sub1=a-b;
    	System.out.println(sub1);
    }
    public  int mul(int a,int b) {
    	int mul1=a*b;
    	return mul1;
    }
    public  int div1(int a,int b) {
    	int div2=a/b;
    	return div2;
    }
}
