/**
 * 
 */
package view;

/**
 *  <strong>Renderizado de Graficos</strong>.
 *  
 * 	<br><br>Interfaz donde renderizamos los graficos.
 * 
 *  @author Mario Gabriel N��ez Alc�zar de Velasco.
 */
public interface Pictures {
	enum action {
		NEW
	}
	
	/**
	 * <strong>M�todo abstracto para manejar el remnderizado de los Frames</strong>
	 */
	public void Frame(action accion);
}