package interfejs;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface IMenjacnica {

	public void dodajKurs(String naziv, String skraceniNaziv, GregorianCalendar datum, double prodajniKurs, double kupovniKurs );	
	public void obrisiKurs(String skraceniNaziv, GregorianCalendar datum);	
	public Valuta vratiKurs(String skraceniNaziv, GregorianCalendar datum);
}
