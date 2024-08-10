package enumeration;

public class Yearr {
	public static void main(String[] args) {
		Monthss[] menuItems = Monthss.values();

		for (Monthss menuItem : menuItems) {
			System.out.print(menuItem.getNum() + ".");
			System.out.println(menuItem.name());
		}
	}
}
