class Angestellter	{
	
	private String vorname;
	private String nachname;
	private int alter;
	protected int gehalt;
	
	Angestellter(String v, String n, int a, int g){
		vorname = v;
		nachname = n;
		alter = a;
		gehalt = g;
	}
	
	private String großKleinSchreibung(String name){
		return Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase();
	}

	
	String getVorname(){
		return vorname;
	}

	String getNachname(){
		return nachname;
	}
/*
	String setNachname(String neuerNachname){
		if(!neuerNachname.equals(Nachname)){
			System.out.println("Angestellter hat seinen Nachname auf %s geändert", neuerNachname);
		}else{
			System.out.println("Nichts passiert");
		}
		
	}
*/	
	int getAlter(){
		return alter;
	}

	int getGehalt(){
		return gehalt;
	}
	
	void setGehalt(int neuesGehalt){
		if (neuesGehalt < gehalt){
			System.err.println("Das ist aber keine Erhöhung!");
		}else{
			gehalt = neuesGehalt;
		}
	}
	
	void erhoeheGehalt(int erhoehung){
  		if (erhoehung <= 0){
		  System.err.println("Das ist aber keine Erhoehung!");
		}else{
		  gehalt += erhoehung;
		}
	}
	
	void geburtstagFeiern(){
		alter++;
		System.out.println("Happy birthday " + vorname + " " + nachname + "!");
	}
	
	public boolean equals(Angestellter a){
		if (a.vorname.equals(vorname) && a.nachname.equals(nachname) &&	a.alter == alter && a.gehalt == gehalt){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	
}