package methode_et_surcharge;

public class Personne {
	
	private String nom;
	private String prenom;
	private int age;
	public  static final int NbreMaxOreil = 2;
	public static int nbreTotalDePersonne;
	
	public Personne() {
	}
	
	public Personne(String nom,String prenom,int age) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		nbreTotalDePersonne++;
	}
	
	public Personne(String nom,int age) {
		this.nom=nom;
		this.age=age;
	}

	
	public void setNom(String nom) {
		this.nom=nom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	
	
	public int getAge() {
		if (age <10) {
			System.out.println("l'age ne peut etre affiche");
		}
		return this.age;
	}
	
	
	
	
}
