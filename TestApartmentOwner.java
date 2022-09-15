package com.oops.pll;
import com.oops.bll.ApartmentOwner;

public class TestApartmentOwner {
	public static void main (String[] args) {
		ApartmentOwner p = new ApartmentOwner("Chanchal Kumar");
		p.setApartment("Sobha Indraprastha,17", 0);
		p.setApartment("RMZ Latitude, 24 ", 1);
		p.setApartment("TATA Promont Luxury, 19", 2);
		p.setApartment("Salarpuria, 20", 5);
		p.setApartment("Phoenix one, 2500", 8);
		System.out.println(p);
		System.out.println();
		System.out.println(p.getOwner() + " has " +
		p.countApartments() + " apartments");
		System.out.println("Apartment 2: " + p.getApartment(2));
		System.out.println();
		p.reorganizeApartments();
		System.out.println(p);
		}
}
