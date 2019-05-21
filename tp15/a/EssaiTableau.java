package tp15.a;

public class EssaiTableau {
	
	public static void main(String[] args) {
		Tableau tab = new Tableau(10);
		NumberFabrik fabrik = new NumberFabrik();
		tab.set(0, fabrik.number(1));
		tab.set(-1, fabrik.number(14.465734));
		tab.set(1, fabrik.number(1465734));
		tab.set(3, fabrik.number(14465734));
		tab.set(7, fabrik.number(14.34f));
		tab.set(9, fabrik.number(123456789));
		tab.set(5, fabrik.number(50, 10));
		
		System.out.println(tab.toString());
		System.out.println("Max = " + tab.max());
	}

}
