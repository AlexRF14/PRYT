package dominio;
public class Equipamiento extends Item{
	protected String tipo;

	public Equipamiento(String nombre, String marca, int precio, String tipo){
		super(nombre, marca, precio);
		this.tipo = tipo;
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public String toString(){
		return super.toString() + " Tipo: " + tipo;
	}
}
