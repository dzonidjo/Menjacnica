package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.IMenjacnica;



public class Menjacnica implements IMenjacnica{

	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	
	public LinkedList<Valuta> getValute() {
		return valute;
	}

	public void setValute(LinkedList<Valuta> valute) {
		this.valute = valute;
	}

	
	@Override
	public void dodajKurs(String naziv, String skraceniNaziv, GregorianCalendar datum, double prodajniKurs,
			double kupovniKurs) {
		
		
			
		Valuta v = new Valuta();
		v.setNaziv(naziv);
		v.setSkraceniNaziv(skraceniNaziv);
		v.setDatum(datum);
		v.setProdajni(prodajniKurs);
		v.setKupovni(kupovniKurs);
		v.setSrednji((prodajniKurs + kupovniKurs)/2);
		
		valute.add(v);	
		
		
	}

	@Override
	public void obrisiKurs(String skraceniNaziv, GregorianCalendar datum) {
		if(skraceniNaziv!=null && datum != null) {	
			
			for (int i = 0; i < valute.size(); i++) {
			int god = valute.get(i).getDatum().YEAR;
			int mesec = valute.get(i).getDatum().MONTH;
			int dan = valute.get(i).getDatum().DAY_OF_MONTH;
				if(valute.get(i).getSkraceniNaziv().equals(skraceniNaziv) && datum.YEAR == god && datum.MONTH == mesec && datum.DAY_OF_MONTH == dan) {
				valute.remove(i);				
					}  	
				
				
			}
				
				}
		
	}

	@Override
	public Valuta vratiKurs(String skraceniNaziv, GregorianCalendar datum) {
		if(skraceniNaziv!=null && datum != null) {	
			
			for (int i = 0; i < valute.size(); i++) {
			int god = valute.get(i).getDatum().YEAR;
			int mesec = valute.get(i).getDatum().MONTH;
			int dan = valute.get(i).getDatum().DAY_OF_MONTH;
				if(valute.get(i).getSkraceniNaziv().equals(skraceniNaziv) && datum.YEAR == god && datum.MONTH == mesec && datum.DAY_OF_MONTH == dan) {
				return valute.get(i);				
				}  	
			}
		}
		return null;
	}


}
