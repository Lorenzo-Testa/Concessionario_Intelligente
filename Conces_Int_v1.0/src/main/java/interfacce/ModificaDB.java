package interfacce;

public interface ModificaDB extends DB{
	
	/** Andranno passati tutti i dati relativi all'auto
	 * 
	 */
	public void InserisciAuto();  
	
	/** Andranno passati targa di un'auto e gli interventi
	 * 
	 */
	public void InserisciIntervento() ;
	
	/** Andranno passati targa di un'auto / telaio
	 * 
	 */
	public void ModificaDatiAuto() ;
	
	/** Andranno passati targa di un'auto / telaio
	 * 
	 */
	public void ModificaInterventi() ;

}
