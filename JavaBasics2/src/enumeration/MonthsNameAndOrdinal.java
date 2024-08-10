package enumeration;

public class MonthsNameAndOrdinal {
	public static void main(String[] args) {
		Months[] months = Months.values();

		for (Months month : months) {
			System.out.print(month.name());
			System.out.print(" .... ");
			System.out.println(month.ordinal());
		}
	}
}
