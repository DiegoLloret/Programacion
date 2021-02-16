/**
 * 
 */
package tienda;

/**
 * @author Diego
 *
 */
public class Articulo {

	private String codigo;
	private String nombre;
	private float precio;
	private int stock;
	
	public Articulo() {};
	
	public Articulo(String codigo,String nombre,float precio, int stock){
		setCodigo(codigo);
		setNombre(nombre);
		setPrecio(precio);
		setStock(stock);
	}
	
	public String getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public int getStock() {
		return stock;
	}
	public void setCodigo(String codigo) {
		this.codigo=codigo;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setPrecio(float precio) {
		this.precio=precio;
	}
	public void setStock(int stock) {
		this.stock=stock;
	}
	@Override
	public String toString() {
		return "Codigo: "+this.codigo+"\nnombre:"+this.nombre+"\nnprecio:"+this.precio+"\nstock:"+this.stock+"\n";
	}
	public boolean disponible (int cantidad) {
		return cantidad<stock;
	}
}
