package zeroAsko;

public class ZeroAskokoBektorea {
	
	private Nodo lehena;
	private Nodo azkena;
	

	/**
	 * berria nodoa bukaeran eransten du
	 * @param berria, erantsiko den nodoa
	 */
	public void erantsiBukaeran(Nodo berria) {

		if (this.lehena == null) {
			lehena = berria;
			azkena = lehena;
		} else {
			this.azkena.hurrengoa = berria;
			azkena = berria;
		}
		
	}


	/**
	 * b1 eta b2 bektoreen batura itzultzen du beste bektore batean
	 * Jatorrizko bektoreak ez dira aldatzen
	 * @param b1	
	 * @param b2
	 * @return b1 eta b2 bektoreen batura
	 * @pre b1 eta b2 bektoreek elementu bana dute gutxienez
	 */
	public static ZeroAskokoBektorea batuketa(ZeroAskokoBektorea b1, ZeroAskokoBektorea b2) {

		ZeroAskokoBektorea b3 = new ZeroAskokoBektorea();
		Nodo era1 = b1.lehena;
		Nodo era2 = b2.lehena;
		int pos, info;
;		
		while (era1 != null && era2 != null) {
			if (era1.pos == era2.pos) {
				pos = era1.pos;
				info = era2.info + era1.info;
				
				era1 = era1.hurrengoa;
				era2 = era2.hurrengoa;
			} else if (era1.pos < era2.pos) {
				pos = era1.pos;
				info = era1.info;
				
				era1 = era1.hurrengoa;
			} else {
				pos = era2.pos;
				info = era2.info;
				
				era2 = era2.hurrengoa;
			}
			
			if (info != 0) {
				Nodo era3 = new Nodo(pos, info);
				b3.erantsiBukaeran(era3);
			}
		}
		
		while (era1 != null) {
			b3.erantsiBukaeran(era1);
			era1 = era1.hurrengoa;
		}
		
		while (era2 != null) {
			b3.erantsiBukaeran(era2);
			era2 = era2.hurrengoa;
		}

		return b3; 
		
		
		
	}
	
	
	public void inprimatu() {
		Nodo lag = lehena;
		while(lag!=null) {
			System.out.println("Posizioa: "+lag.pos+" balioa: "+lag.info);
			lag=lag.hurrengoa;
		}
		System.out.println();
	}


}
