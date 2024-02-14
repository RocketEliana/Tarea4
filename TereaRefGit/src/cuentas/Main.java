


package cuentas;

/**Clase main que nos permite realizar acciones como ingresar y retirar
 * @author bicho
 * 
 * */
public class Main {
	
/** Instancia Metodo operativa_cuenta
 * 
 * @param args le damos argumentos a la instancia desde el metodo operativa_cuenta
 */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }
    
/**Metodo operativa_cuenta
 * 
 * @param cantidad el parametro cantidad nos permite operar con los metodos
 */
	public static void operativa_cuenta(float cantidad) {
		
		CCuenta cuenta1;
        double saldoActual;
        


        cuenta1 = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}

	}