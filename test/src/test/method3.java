package test;

public class method3 {

	public static void main(String[] args) {
		//even(100);
		method3 m1=new method3();
		m1.odd(99);
		

	}
	public static void even(int a) {
		for(int i=0;i<=a;i++) {
			if (i%2==0) {
				System.out.println("even number= "+i);
			}else {
				System.out.println("odd num= "+i);
			}
		}
	}
	public void odd(int a) {
	for(int i=0;i<=a;i++) {
		if (i%2==1) {
			System.out.println("odd number= "+i);
		}
}
	}
	}
