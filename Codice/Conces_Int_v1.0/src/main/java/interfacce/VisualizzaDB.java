package interfacce;

public interface VisualizzaDB  extends DB{
	
	/** Non prende nulla in ingresso
	 * 
	 */
	public void VisualizzaAll() ;
	
	/** In input: concessionario
	 * 
	 */
	public void VisualizzaInterventiAll() ;
	
	/** In input: targa auto/telaio
	 * 
	 */
	public void VisualizzaInterventiAuto() ;
	
	/** Prende in input targa/telaio
	 * 
	 */
	public void VisualizzaDatiAuto() ;
	
	/** Non prende nulla in input
 	 * 
	 */
	public void VisualizzaAutoTrasporto() ;

}
