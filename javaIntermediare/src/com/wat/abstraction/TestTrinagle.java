package com.wat.abstraction;

public class TestTrinagle  {

	public static void main(String[] args) {
		
		Forme2 []  tab1=new Forme2[3];
		
		Forme2 f1=new Losange();
		Forme2 f2=new Triangle();
		
		tab1[0]=f1;
		tab1[1]=f2;
		tab1[2]=f2;
		
		
		for(Forme2 f:tab1) {
			System.out.println(f.air());
		}
	}

}
