package dominio;
import dominio.*;
public class Item{
        protected String nombre;
        protected String marca;
        protected int precio;

        public Item(String nombre, String marca, int precio){
                this.nombre = nombre;
                this.marca = marca;
                this.precio = precio;
        }
        public void setNombre(String nombre){
                this.nombre = nombre;
        }
        public void setMarca(String marca){
                this.marca = marca;
        }
        public void setPrecio(int precio){
                this.precio = precio;
        }
        public String toString(){
                return "Item. Nombre: " + nombre + " Marca: " + marca + " Precio: " + precio;
        }

}

