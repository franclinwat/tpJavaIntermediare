package methode_et_surcharge;

public class TestMethode {

	public static void main(String[] args) {
		
		Personne meth=new Personne("wat","fran",10);
		Personne meth2=new Personne("wat1","fran",13);
		Personne meth3=new Personne("wat2","fran",17);
		System.out.println(meth.getNom());
		meth.setNom("franclin");
		System.out.println(meth.getNom());
		System.out.println(meth.getAge());
		System.out.println(Personne.nbreTotalDePersonne);
		System.out.println(Personne.NbreMaxOreil);
	


	}

}
