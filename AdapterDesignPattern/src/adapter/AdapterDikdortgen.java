package adapter;

import dao.D�rtgen;
import interFace.AlaHesapla;

public class AdapterDikdortgen implements AlaHesapla {

	private D�rtgen element = new D�rtgen();
	
	@Override
	public int alanHesapla(int a, int b) {
		// TODO Auto-generated method stub
		return element.calculatedField(a, b);
	}

}
