package menjacnica;

import java.util.GregorianCalendar;

import interfejs.IMenjacnica;

public class Menjacnica implements IMenjacnica{

	@Override
	public void dodajKurs(String naziv, String skraceniNaziv, GregorianCalendar datum, double prodajniKurs,
			double kupovniKurs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void obrisiKurs(String skraceniNaziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Valuta vratiKurs(String skraceniNaziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
