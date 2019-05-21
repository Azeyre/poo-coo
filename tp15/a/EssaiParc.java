package tp15.a;

public class EssaiParc {
	
	public static void main(String[] args) {
		Piece souris = new Piece("Souris", 123);
		Piece clavier = new Piece("Clavier", 124);
		Element uniteCentrale = new Element("Unite centrale");
		Piece cm = new Piece("Carte mère", 478);
		Piece gc = new Piece("Carte graphique", 7856);
		uniteCentrale.ajouterPiece(cm);
		uniteCentrale.ajouterPiece(gc);
		
		Element processeur = new Element("Processeur");
		Piece transistor = new Piece("Transistor", 13);
		Piece condensateur = new Piece("Condensateur", 45);
		processeur.ajouterPiece(transistor);
		processeur.ajouterPiece(condensateur);
		
		uniteCentrale.ajouterPiece(processeur);
		
		Poste pc = new Poste("Poste d'Alice");
		pc.ajouterPiece(souris);
		pc.ajouterPiece(clavier);
		pc.ajouterPiece(uniteCentrale);
		System.out.println(pc);
		pc.retirerPiece(souris);
		System.out.println("Nouveau : " + pc);
	}

}
