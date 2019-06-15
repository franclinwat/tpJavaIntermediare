package com.wat.tpLamp;

public class Interupteur {
	private Lampe lampe;
	
	private  boolean statutInterupteur;
	   
	   public boolean clic() {
		   if (statutInterupteur) {
			 
			  System.out.println("lampe allumer");
			   return statutInterupteur=!statutInterupteur;
			     
		   }else
		
		       System.out.println("lampe eteint");
			   return statutInterupteur=!statutInterupteur;
			   
	   }

}
