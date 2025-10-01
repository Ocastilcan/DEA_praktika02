package esaldia;

public class Esaldia {
	NodoBikoitz<String> lehena;
	
	public Esaldia(String esaldia) {
		sortuEsaldia(esaldia);
	}


	/**
	 * hitza ezabatzen du listatik, aurretik dituen zenb hitzekin eta
	 * atzetik dituen zenb hitzekin batera
	 * @param hitza, ezabatuko den hitza
	 * @param zenb, aurretik eta atzetik ezabatuko diren hitzen kopurua
	 * @pre, hitza behin dago listan 
	 * @pre, hitzak baditu gutxienez zenb hitz aurretik eta zenb hitz atzetik
	 */
	public void testuinguruanEzabatu(String hitza, int zenb) {

		NodoBikoitz<String> era1 = this.lehena;
		NodoBikoitz<String> era2;
		
		while (!era1.datua.equals(hitza)) {
			era1 = era1.hurrengoa;
		}
		era2 = era1;
		for(int i = 0; i <= zenb; i++) {
			era1 = era1.hurrengoa;
			era2 = era2.aurrekoa;
		}
		if (era1 == null && era2 == null) {
			lehena = null;
		}
		else if (era1 == null) {
			era2.hurrengoa = null;
		} else if (era2 == null) {
			era1.aurrekoa = null;
			lehena = era1;
		} else {
			era2.hurrengoa = era1;
			era1.aurrekoa = era2;
		}
	
	}
	
	// Probatarako metodo lagungarriak. Ez aldatu
	public void sortuEsaldia(String esaldia) {
		if(esaldia.trim().length()==0) return;
		String[] hitzak = esaldia.trim().split("\\s+");
		
		lehena = new NodoBikoitz<String>(hitzak[0]);
		
		NodoBikoitz<String> ult = lehena;
		for(int i=1; i<hitzak.length;i++) {
			ult.hurrengoa = new NodoBikoitz<String>(hitzak[i]);
			ult.hurrengoa.aurrekoa = ult;
			ult = ult.hurrengoa;
		}
	}
	
	public void aurrerantzInprimatu() {
		NodoBikoitz<String> unekoa = lehena;
		while(unekoa!=null) {
			System.out.print(unekoa.datua+" ");
			unekoa = unekoa.hurrengoa;
		}
		System.out.println();
	}
	
	public void atzerantzInprimatu() {
		if(lehena == null) return;
		
		NodoBikoitz<String> unekoa = lehena;
		while(unekoa.hurrengoa!=null) {
			unekoa = unekoa.hurrengoa;
		}
		while(unekoa!=null) {
			System.out.print(unekoa.datua+" ");
			unekoa = unekoa.aurrekoa;
		}
		System.out.println();
	}

}
