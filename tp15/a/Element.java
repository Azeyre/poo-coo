package tp15.a;

import java.util.HashMap;

public class Element {
	
	protected HashMap<Integer, Element> elements = new HashMap<>();
	protected String nom;
	protected static int ID = 0;
	
	public Element(String nom) {
		this.nom = nom;
		ID++;
	}
	
	public String toString() {
		String res = nom + " [ \n";
		for(Element i: elements.values()) {
			res += i.toString() + ", \n";
		}
		return res + " ]";
	}
	
	public void ajouterPiece(Piece p) {
		elements.put(p.ID, p);
	}
	
	public void retirerPiece(int id) {
		elements.remove(id);
	}
	
	public void retirerPiece(Piece p) {
		elements.remove(p.ID);
	}
	
	public void ajouterPiece(Element e) {
		elements.put(ID, e);
	}
}
