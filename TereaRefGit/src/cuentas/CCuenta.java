
package cuentas;

/**Clase CCuenta
 * permite informacion sobre acciones 
 * como retirar, ingresar, estado cuenta
 * @author bicho
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
/**Constructor por defecto clase CCuenta
 * Atributos sin inicializar
 */

    public CCuenta()
    {
    }

    /**Constructor CCuenta
     * Le damos parametros al objeto
     * 
     * @param nom nombre usuario
     * @param cue cuenta usuario
     * @param sal saldo de la cuenta
     * @param tipo tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
/**Metodo estado
 * 
 * @return getSaldo estado saldo cuenta
 */
    public double estado()
    {
        return getSaldo();
    }
    /**metodo ingresar
     * 
     * @param cantidad cantidad a ingresar
     * @throws Exception nos devuelve situacion de negacion de retirar o ingresar
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**Metodo retirar
     * 
     * @param cantidad cantidad introducida
     * @throws Exception nos muestra situaciones en las que no podemos retirar
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**Metodo getCuenta
 * 
 * @return cuenta
 */
	private String getCuenta() {
		return cuenta;
	}
/**Metodo cambia cuenta
 * 
 * @param damos valor a la cuenta
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**Metodo daNombre
 * 
 * @return nombre
 */
	private String getNombre() {
		return nombre;
	}
/**Metodo cambiaNombre
 * 
 * @param nombre damos valor al numbre del cliente */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**Metodo da saldo
	 * 
	 * @return saldo
	 */

	private double getSaldo() {
		return saldo;
	}
/**Metodo cambia saldo
 * 
 * @param saldo samos valor al saldo
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**Metodo da TipoInteres
 * 
 * @return tipoInteres
 */
	private double getTipoInteres() {
		return tipoInteres;
	}
/**Metodo cambiar tipoInteres
 * 
 * @param tipoInteres damos valor tipo de interes
 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
