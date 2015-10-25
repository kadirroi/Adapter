package adapter;

import dao.Dörtgen;
import interFace.AlaHesapla;

public class AdapterDikdortgen implements AlaHesapla {

	private Dörtgen element = new Dörtgen();
	
	@Override
	public int alanHesapla(int a, int b) {
		// TODO Auto-generated method stub
		return element.calculatedField(a, b);
	}

}
