package com.wat.blockDinitialisation;

import java.util.ArrayList;

public class BlockDinitialisation {
	
	public static ArrayList<String> importantData;
	
	static {
		
		importantData=getDataFromInternet();
	}

	private static ArrayList<String> getDataFromInternet() {
		System.out.println("telecharger dnne d'interne");
		 ArrayList<String>data=new ArrayList<>();
		 data.add("Google");
		 data.add("facebook");
		 data.add("yahoo");
		 data.add("instagram");
		
		return data;
	}

}
