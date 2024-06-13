class Bicycle {
    void displayFeatures() {
	System.out.println("Features: pedals, Manual power");
    }
}
class Motorbike extends Bicycle {
    void displayFeatures() {
	super.displayFeatures();
	System.out.println("Added features by MotorBike: Engine");
    }
}
class ElectricBike extends Motorbike {
    void displayFeatures() {
	super.displayFeatures();
	System.out.println("new features by ElectricBIke: Electric motor and battery");
    }
}
class TransMul {
    public static void main(String args[]) {
	ElectricBike myEbike = new ElectricBike();
	myEbike.displayFeatures();
 }
}