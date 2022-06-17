package assignment;

public class TwoWheeler {
	
	int noOfWheels=10;
	short noOfMirrors=4;
	long chassisNumber=2022;
	boolean isPunctured=true;
	String bikeName="Royal Enfield";
	double runningKM=1089;
	
	public static void main(String[] args) {
		
		TwoWheeler bike = new TwoWheeler();
		
		System.out.println(bike.noOfWheels);
		
		System.out.println(bike.noOfMirrors);
		
		System.out.println(bike.chassisNumber);
		
		System.out.println(bike.isPunctured);
		
		System.out.println(bike.bikeName);
		
		System.out.println(bike.runningKM);
	}

}
