package zeroAsko;

public class ProbaZeroAskokoBektorea {

	public ProbaZeroAskokoBektorea() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int[] arr1 = {0,0,0,7,0,0,12,0,3,0};
		int[] arr2 = {0,4,0,7,0,0,-12,0,0,1};

		System.out.println("Bektore 1");
		ZeroAskokoBektorea b1 = sortuArrayaBektoretik(arr1);
		b1.inprimatu();

		System.out.println("Bektore 2");
		ZeroAskokoBektorea b2 = sortuArrayaBektoretik(arr2);
		b2.inprimatu();

		ZeroAskokoBektorea bbatura = ZeroAskokoBektorea.batuketa(b1, b2);
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