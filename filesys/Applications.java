package filesys;
import filesys.Fichier;
import filesys.Repertoire;

public class Applications {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repertoire R1 = new Repertoire("R1");
		Repertoire R2 = new Repertoire("R2");
		Fichier F1 = new Fichier("F1", 8);
		Fichier F2 = new Fichier("F2");
		R2.add(F1);
		R1.add(R2);
		R1.add(F2);
		System.out.println("la taille de f1 : " + F1.getTaille());
		System.out.println("la taille de f2 : " + F2.getTaille());
		System.out.println("la taille de r1 : " + R2.getTaille());
		System.out.println("la taille de r2 : " + R1.getTaille());

	}

}
