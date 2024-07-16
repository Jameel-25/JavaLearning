package oopsBasic;

class Bike {
	String bikeName;
	String bikeNumber;
	int modelNumber;
	String engineNumber;

	void engineStart() {

	}

	void move() {

	}

	void engineStop() {

	}
}

class Student {
	int sNo;
	String sName;
	String course;
	double fee;

	void goingToCellegeBy(Bike b) {
		System.out.println(this.sName + " is going to college by " + b.bikeName + " bike.");

	}
}

public class Parent {
	public static void main(String[] args) {

		// buying bike(creating Bike object
		Bike pulsar = new Bike();
		pulsar.bikeName = "Pulsar 180";
		pulsar.bikeNumber = "8192";
		pulsar.modelNumber = 2007;
		pulsar.engineNumber = "443322";

		// Creating student object
		Student s = new Student();
		s.sName = "Jameel";
		s.sNo = 85;
		s.course = "Java";
		s.fee = 5000;

		s.goingToCellegeBy(pulsar);
	}
}
