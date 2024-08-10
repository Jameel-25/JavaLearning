package test1;

public class Depo {
	public static void main(String[] args) {
		Driver driver1 = new Driver();
		driver1.assignVehicle(new Volvo());

		Driver driver2 = new Driver();
		driver2.assignVehicle(new RedBus());
	}
}
