package esaldia;

public class ProbaEsaldia {

	public ProbaEsaldia() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// Bukaera ezabatu
		System.out.println("### Proba 1 ###");
		probaKasuaExekutatu("atzo erositako liburua ederra eta bikaina da", "bikaina", 1);

		// Erdikoa ezabatu
		System.out.println("\n\n### Proba 2 ###");
		probaKasuaExekutatu("atzo erositako liburua ederra eta bikaina da", "ederra", 2);

		// Hitz bakar bat baldin badago
		System.out.println("\n\n### Proba 3 ###");
		probaKasuaExekutatu("kaixo", "kaixo", 0);

		// Esaldi osoa ezabatu
		System.out.println("\n\n### Proba 4 ###");
		probaKasuaExekutatu("atzo erositako liburua ederra eta bikaina da", "ederra", 3);
		
		// Hasiera ezabatu
		System.out.println("\n\n### Proba 5 ###");
		probaKasuaExekutatu("atzo erositako liburua ederra eta bikaina da", "liburua", 2);

	}

	private static void probaKasuaExekutatu(String esaldia, String hitza, int zenb) {
		Esaldia f1 = new Esaldia(esaldia);
		System.out.print("Jatorrizko esaldia: ");
		f1.aurrerantzInprimatu();
		f1.testuinguruanEzabatu(hitza, zenb);
		System.out.println("testuinguruanEzabatu(\""+hitza+"\","+zenb+") deiaren ondoren:");
		System.out.print("-Esaldia aurrerantz: ");
		f1.aurrerantzInprimatu();
		System.out.print("-Esaldia atzerantz: ");
		f1.atzerantzInprimatu();
	}

}

