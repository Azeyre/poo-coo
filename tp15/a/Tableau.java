package tp15.a;

public class Tableau {
	
	Number[] tab;
	
	public Tableau(int size) {
		tab = new Number[size];
	}
	
	public void set(int i, Number n) {
		if(i < 0 || i >= tab.length) {
			System.err.println("L'index spécifié est invalide !");
		} else {
			tab[i] = n;
		}
	}

	public Number max() {
		Number max = tab[0];
		for(int i = 1 ; i < tab.length ; i++) {
			if(tab[i] != null && tab[i].doubleValue() > max.doubleValue()) max = tab[i];
		}
		return max;
	}
	
	public String toString() {
		String res = "Tableau [\n";
		for(int i = 0 ; i < tab.length ; i++) {
			if(tab[i] != null) res += tab[i].toString() + ",\n";
		}
		return res + "]";
	}
}
