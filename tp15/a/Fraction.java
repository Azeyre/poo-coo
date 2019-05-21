package tp15.a;

public class Fraction extends Number {
	
	private static final long serialVersionUID = 6447199591984140134L;
	private Number num;
	private Number denum;
	
	public Fraction(int num, int denum) {
		this.num = new Integer(num);
		this.denum = new Integer(denum);
	}
	
	public String toString() {
		return "" + num + " / " + denum + " = " + (num.intValue() / denum.intValue());
	}

	public double doubleValue() {
		return num.doubleValue() / denum.doubleValue();
	}
	
	public float floatValue() {
		return num.floatValue() / denum.floatValue();
	}
	
	public int intValue() {
		return num.intValue() / denum.intValue();
	}
	
	public long longValue() {
		return num.longValue() / denum.longValue();
	}
	
}
