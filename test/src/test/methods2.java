package test;

public class methods2 {

	public static void main(String[] args) {
		strings1("ganesh yadav");
		System.out.println(" ");
		strings1("bhagyshree ganesh yadav");
		System.out.println(" ");
		methods2 m1=new methods2();
		m1.strings2("mayuri yadav");
		
	}
		public static void strings1(String s) {
			char c[]=s.toCharArray();
			int size1=c.length; 
			for(int i=size1-1;i>=0;i--) {
				System.out.print(c[i]);
			}
			
		}
		public void strings2(String s) {
			char c[]=s.toCharArray();
			int size1=c.length;
			for(int i=size1-1;i>=0;i--) {
				System.out.print(c[i]);
			}
			
		}
}
