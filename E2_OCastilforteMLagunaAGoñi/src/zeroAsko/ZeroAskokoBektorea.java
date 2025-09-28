package zeroAsko;

public class ZeroAskokoBektorea {
	
	private Nodo lehena;
	private Nodo azkena;
	

	/**
	 * berria nodoa bukaeran eransten du
	 * @param berria, erantsiko den nodoa
	 */
	public void erantsiBukaeran(Nodo berria) {

		
		// HAU OSATU
		
		
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


		
		// HAU OSATU
		
		return null;  // HAU EZABATU
		
		
		
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
