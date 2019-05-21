package tp15.a;

public class NumberFabrik {

	public Number number(int n) {
		return new Integer(n);
	}
	
	public Number number(double n) {
		return new Double(n);
	}
	
	public Number number(float n) {
		return new Float(n);
	}
	
	public Number number(long n) {
		return new Long(n);
	}
	
	public Number number(int n1, int n2) {
		return new Fraction(n1,n2);
	}
	
	public Number number(String s) {
		try {
			return number(Integer.valueOf(s));
		} catch (NumberFormatException e) {}
		try {
			return number(Double.valueOf(s));
		} catch (NumberFormatException e) {}
		try {
			return number(Float.valueOf(s));
		} catch (NumberFormatException e) {}
		try {
			return number(Long.valueOf(s));
		} catch (NumberFormatException e) {}
		try {
			int n1 = Integer.valueOf(s.split(" ")[0]);
			int n2 = Integer.valueOf(s.split(" ")[1]);
			return number(n1,n2);
		} catch (NumberFormatException e) {}
		System.err.println("Le texte passé en paramètre est invalide !");
		return null;
	}
}
