package filesys;
import java.util.ArrayList;
/**
 * Write a description of class CompositDocument here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class CompositDocument extends Document
{
    // instance variables - replace the example below with your own
    private ArrayList<Document> ChildDocuments = new ArrayList<Document>();
    
    //Ajoute le graphique à la composition.
    public void add(Document doc) {
        ChildDocuments.add(doc);
        taille = taille + doc.getTaille();
    }
 
    //Retire le graphique de la composition.
    public void remove(Document doc) {
        ChildDocuments.remove(doc);
        taille = taille - doc.getTaille();
    }

}
