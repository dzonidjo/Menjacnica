package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	
	private GregorianCalendar datum;
	private double kupovni;
	private double prodajni;
	private double srednji;
	
	
	
	public double getKupovni() {
		return kupovni;
	}

	public void setKupovni(double kupovni) {
	
		this.kupovni = kupovni;
	}

	public double getProdajni() {
		return prodajni;
	}

	public void setProdajni(double prodajni) {
		
		this.prodajni = prodajni;
	}

	public double getSrednji() {
		return srednji;
	}

	public void setSrednji(double srednji) {
		
		this.srednji = srednji;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {

	this.datum = datum;
	}
	
	public String getNaziv() {
		
		return naziv;
	}
	public void setNaziv(String naziv) {
	
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
	
		this.skraceniNaziv = skraceniNaziv;
	}
	
	
	
}
