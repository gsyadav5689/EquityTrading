package test;

public class Array {

	public static void main(String[] args) {
		int a[]= {11,12,13,14,15};
		int size1=a.length;
		int sum=0;
		int avg=0;
		for (int i=0;i<size1;i++) {
			sum=sum+a[i];
			avg=sum/size1;
			
		}
		System.out.println(sum);
		System.out.println(avg);

	}

}
