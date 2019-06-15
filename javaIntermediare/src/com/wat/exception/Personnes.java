package com.wat.exception;

public class Personnes {

	private String nom;
	private String prenom;
	private int age;
	public  static final int NbreMaxOreil = 2;
	public static int nbreTotalDePersonne;
	
	public Personnes() {
	}
	
	public Personnes(String nom,String prenom,int age) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		nbreTotalDePersonne++;
	}
	
	public Personnes(String nom,String prenom) {
		this.nom=nom;
		this.prenom=prenom;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		if(age<16) {
			throw new IllegalArgumentException("l'age doit etre supperieur a 16 ans");
		}else
			System.out.println("l'age est :"+ age);
	}


	public static int getNbremaxoreil() {
		return NbreMaxOreil;
	}
	
	
	
	
	
	
}
