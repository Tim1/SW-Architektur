/**
 * 
 */
package swa.runningeasy.extern;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public interface IBank {
	// TODO: what return Value?
	//TODO: das wird laut anforderung nie verlangt dass wir die kontodaten wissen, nur die Buchungen, die eingegangen sind?
//	public void getKontoData();

	// TODO: what return Value?
	public void liefereZalungseingaenge();
}
