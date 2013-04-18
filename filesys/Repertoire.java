package filesys;

/**
 * Write a description of class Repertoire here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Repertoire extends CompositDocument {
	/**
	 * Constructor for objects of class Repertoire
	 */
	public Repertoire() {
		// initialise instance variables
		this.titre = "New Folder";
		taille = 0;
	}

	/**
	 * Constructor for objects of class Repertoire
	 */
	public Repertoire(String titre) {
		// initialise instance variables
		this.titre = titre;
		taille = 0;
	}

}
