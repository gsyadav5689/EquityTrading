package test;

public class arraysort {

	public static void main(String[] args) {
		int a[]= {11,10,9,7,15,14,19,21};
		int temp;
		int size1=a.length;
		for(int i=0;i<size1;i++) {
			for(int j=i+1;j<size1;j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}
			}
		}
		System.out.println("largest no in array= "+a[size1-1]);
		System.out.println("lowest no in array= "+a[0]);
	}

}
