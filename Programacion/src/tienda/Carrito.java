/**
 * 
 */
package tienda;

import java.util.ArrayList;

/**
 * @author Diego
 *
 */
public class Carrito {
ArrayList<ArticuloCarrito> pedido =new ArrayList<ArticuloCarrito>();
float total;
boolean confirmado;
public static boolean CONFIRMADO =true;
public static boolean PENDIENTE =false;
public Carrito () {
	pedido=new ArrayList<ArticuloCarrito>();
	total=0;
	confirmado=PENDIENTE;
}
private float calculaTotal() {
	float acumulado =0;
	for(ArticuloCarrito ac: this.pedido) {
		acumulado+=ac.elemento.getPrecio()*ac.cantidad;
	}
		return acumulado;
	
	
}
}
