package enumeration;

public enum Monthss {
	JAN(1), FEB(2);

	private int num;

	Monthss(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
