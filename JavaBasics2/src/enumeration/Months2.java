package enumeration;

public enum Months2 {
	JAN(1), FEB(2L), MAR("3");

	private int number;

	private Months2(int num) {
		this.number = num;
	}

	private Months2(long num) {
		this.number = (int) num;
	}

	private Months2(String num) {
		this.number = Integer.parseInt(num);
	}
}
