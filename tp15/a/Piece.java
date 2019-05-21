package tp15.a;

public class Piece extends Element {
	
	protected final int ID;
	
	public Piece(String s, int id) {
		super(s);
		this.ID = id;
	}
	
	public String toString() {
		return nom + "(N°" + ID + ")";
	}
	
	public int getId() {
		return ID;
	}
}
