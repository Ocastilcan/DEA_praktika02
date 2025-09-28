package esaldia;

public class NodoBikoitz<E> {
	E datua;
	NodoBikoitz<E> aurrekoa;
	NodoBikoitz<E> hurrengoa;

	public NodoBikoitz(E datua) {
		this.datua = datua;
	}

}
