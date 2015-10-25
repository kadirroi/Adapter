package home;

import adapter.AdapterDikdortgen;
import dao.Kare;
import dao.Ucgen;
import interFace.AlaHesapla;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlaHesapla alaHesapla= new Kare();
		System.out.println("Kare Alaný:"+alaHesapla.alanHesapla(5, 5));

	     alaHesapla= new Ucgen();
		System.out.println("Ucgen Alaný:"+alaHesapla.alanHesapla(5, 5));
		

	     alaHesapla= new  AdapterDikdortgen();
		System.out.println("Adaptör Alaný:"+alaHesapla.alanHesapla(20,40));
		
	}

}
