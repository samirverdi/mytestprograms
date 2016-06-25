class AngestelltenVerwaltung{
	public static void main(String[] args)  {
    
    Angestellter a1 = new Angestellter("Petra", "Mueller", 25, 1800);
    Angestellter a2 = new Angestellter("Leszek", "Wawrzyniak", 23, 1600);
  
    // Gehalt von Herrn Wawrzyniak erhöhen
    System.out.println("Das alte Gehalt von Herrn Wawrzyniak: " + a1.getGehalt());
    a2.erhoeheGehalt(750);
	
    System.out.println("Das neue Gehalt von Herrn Wawrzyniak: " + a1.getGehalt());
	
	System.out.println("Vorname der ersten Angestellter ist: " + a1.getVorname());
	
	a1.geburtstagFeiern();
    System.out.println("Das Alter von Frau Mueller: " + a1.getAlter());
	
	Angestellter a = new Angestellter("Johannes", "Schmidt", 28, 2200);
	System.out.println("Das Alter von "+ a.getVorname() + " ist " + a.getAlter());
	a.geburtstagFeiern();
	System.out.println("Das Alter von "+ a.getVorname() + " ist jetzt " + a.getAlter());
	
	Manager m = new Manager("Nico", "Merhof", 43, 3800, "Mercedes");
	
	JahresGehaltserhoehung jahresGE = new 
	
	}
}