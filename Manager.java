class Manager extends Angestellter{
	
	String firmenWagen;

	Manager(String v, String n, int a, int g){
		super(v,n,a,g);
	}

	Manager(String v, String n, int a, int g, String auto){
		this(v,n,a,g);
		firmenWagen = auto;
	}

	void standardGehaltserhoehung(){
		gehalt += 100;
	}

	void setFirmenWagen(String auto){
		firmenWagen = auto;
	}

	String getFirmenWagen(){
		return firmenWagen;
	}
}