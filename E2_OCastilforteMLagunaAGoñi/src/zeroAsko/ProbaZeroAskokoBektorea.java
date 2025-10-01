package zeroAsko;

public class ProbaZeroAskokoBektorea {

	public ProbaZeroAskokoBektorea() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int[] arr1 = {0,0,0,7,0,0,12,0,3,0};
		int[] arr2 = {0,4,0,7,0,0,-12,0,0,1};
		int[] arr3 = {};
		int[] arr4 = {0,0,1,0,-2,3};
		int[] arr5 = {0,0,-1,0,2,-3};
 		
		System.out.println("#PROBA 1#");
		
		System.out.println("Bektore 1");
		ZeroAskokoBektorea b1 = sortuArrayaBektoretik(arr1);
		b1.inprimatu();

		System.out.println("Bektore 2");
		ZeroAskokoBektorea b2 = sortuArrayaBektoretik(arr2);
		b2.inprimatu();

		ZeroAskokoBektorea bbatura = ZeroAskokoBektorea.batuketa(b1, b2);
		System.out.println("Batutako bektorea");
		bbatura.inprimatu();

		System.out.println("\n#PROBA 2# 2 bektore hutsen batura");
		System.out.println("Bektore 1");
		ZeroAskokoBektorea b3 = sortuArrayaBektoretik(arr3);
		b3.inprimatu();
		System.out.println("Bektore 2");
		b3.inprimatu();
		bbatura = ZeroAskokoBektorea.batuketa(b3, b3);
		System.out.println("Batutako bektorea");
		bbatura.inprimatu();

		System.out.println("\n#PROBA 3# bektore bat eta bektore huts baten arteko batura");
		System.out.println("Bektore 1");
		b1.inprimatu();
		System.out.println("Bektore 2");
		b3.inprimatu();
		bbatura = ZeroAskokoBektorea.batuketa(b1, b3);
		System.out.println("Batutako bektorea");
		bbatura.inprimatu();

		System.out.println("\n#PROBA 4# luzera ezberdineko bektoreen batura");
		System.out.println("Bektore 1");
		ZeroAskokoBektorea b4 = sortuArrayaBektoretik(arr4);
		b4.inprimatu();
		System.out.println("Bektore 2");
		b1.inprimatu();
		bbatura = ZeroAskokoBektorea.batuketa(b4, b1);
		System.out.println("Batutako bektorea");
		bbatura.inprimatu();

		System.out.println("\n#PROBA 5# Bektore bat eta bere negatiboaren batura");
		System.out.println("Bektore 1");
		ZeroAskokoBektorea b5 = sortuArrayaBektoretik(arr5);
		b5.inprimatu();
		System.out.println("Bektore 2");
		b4.inprimatu();
		bbatura = ZeroAskokoBektorea.batuketa(b5, b4);
		System.out.println("Batutako bektorea");
		bbatura.inprimatu();


	}

	// Probatarako metodo lagungarria, ez aldatu
	public static ZeroAskokoBektorea sortuArrayaBektoretik(int arr[]) {
		ZeroAskokoBektorea b = new ZeroAskokoBektorea();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				b.erantsiBukaeran(new Nodo(i, arr[i]));
		}
		return b;
	}

}
