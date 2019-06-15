package com.wat.exception;

public class PersonneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Personnes p1=new Personnes("wat", "fran"); 
		
			try {	
		p1.setAge(1);
			}catch (IllegalArgumentException e) {
			e.printStackTrace();
			}
		System.out.println("l'age est de :"+p1.getAge()+"ans");
		
		}
}
