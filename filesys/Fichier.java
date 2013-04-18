package filesys;

/**
 * Write a description of class Fichier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fichier extends Document
{
    /**
     * Constructor for objects of class Fichier
     */
    public Fichier()
    {
        // initialise instance variables
        this.titre = "New File";
        this.taille = 0;
    }
    
    /**
     * Constructor for objects of class Fichier
     */
    public Fichier(String titre)
    {
        // initialise instance variables
        this.titre = titre;
        this.taille = 0;
    }
    
    /**
     * Constructor for objects of class Fichier
     */
    public Fichier(String titre, int taille)
    {
        // initialise instance variables
        this.titre = titre;
        this.taille = taille;
    }
}
