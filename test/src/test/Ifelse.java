package test;

public class Ifelse {

	public static void main(String[] args) {
		int eng=100,math=100,sci=100;
		int avg;
		avg=(eng+math+sci)/3;
		if (avg>=80 && avg<=100) {
			System.out.println("A grade & your avg is "+ avg);
		}
		else if (avg>=60 && avg<80) {
			System.out.println("B grade & your avg is "+ avg);	
		}
		else if (avg>=40 && avg<60) {
			System.out.println("C grade & your avg is "+ avg);	
		}
		else if (avg>=20 && avg<40) {
			System.out.println("D grade & your avg is "+ avg);	
		}

	}

}
