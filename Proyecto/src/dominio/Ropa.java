package dominio;
public class Ropa extends Item{
	protected String talla;
	public Ropa(String nombre,  String marca, int precio, String talla){
		super(nombre, marca, precio);
		this.talla = talla;
	}
	public void setTalla(String talla){
		this.talla = talla;
	}
	public String toString(){
		return super.toString() + " Talla: " + talla;
	}
}
