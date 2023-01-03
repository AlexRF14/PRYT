package aplicacion;
import dominio.*;
//import interfaz.*;
import java.util.*;
import java.util.Scanner;
public class Principal{
	 public static void main(String args []){
		 ArrayList<Item> lista = new ArrayList<Item>();
  			lista.add(new Ropa("MJ" , "Nike" , 110 , "M"));				
			lista.add(new Ropa("Argentina" , "Adidas" , 110 , "L"));
			lista.add(new Ropa("Francia" , "Nike" , 110 , "S"));
			lista.add(new Equipamiento("Pure Drive" , "Babolat" , 90 , "Raqueta"));
			lista.add(new Equipamiento("Strong protect" , "Nike" , 35 , "Casco"));
			lista.add(new Equipamiento("9m Climbing" , "Black Diamond" , 85 , "Cuerda de escalada"));
		ArrayList<Item> bajas = new ArrayList<Item>();
			bajas.add(new Ropa("JJ" , "Adidas" , 140 , "L"));
			bajas.add(new Equipamiento("Black bat" , "HKH" , 45 , "Bate de baseball"));

			int opcion;
			boolean salir = false;
			
			 int opcion2;
                         boolean salir2 = false;

			while(!salir){
			System.out.println("Seleccionar una de las siguientes opciones");
			System.out.println("1: Visualizar el catálogo");
			System.out.println("2: Añadir Ropa al catálogo");
			System.out.println("3: Añadir un Equipamiento al catálogo");
			System.out.println("4: Quitar Items del catálogo");
			System.out.println("5: Modificar una Ropa");
			System.out.println("6: Modificar un Elemento");
			System.out.println("7: Visualizar la lista de bajas");
			System.out.println("8: Añadir un producto de la lista de bajas al catálogo"); 
			System.out.println("9: Bajar un producto a la lista de bajas");
			System.out.println("10: Salir del programa");
			


		        Scanner sc = new Scanner(System.in);
			
			opcion = sc.nextInt();
			switch(opcion){
			case 1:
				for (Item texto : lista){

					System.out.println(texto);
				}
				break;
			case 2:
				Scanner cs = new Scanner(System.in);
				System.out.println("Nombre del prodructo ");
				String nombrer = cs.nextLine();
				System.out.println("Nombre de la marca ");
				String marcar = cs.nextLine();
                                System.out.println("Talla de la prenda ");
				String nounr = cs.nextLine();
				System.out.println("Precio (sin símbolos) ");
				int numr = cs.nextInt();
				lista.add(new Ropa(nombrer , marcar , numr , nounr ));
				break;
			case 3:
                                Scanner ss = new Scanner(System.in);
				System.out.println("Nombre del prodructo ");
                                String nombre = ss.nextLine();
                                System.out.println("Nombre de la marca ");
                                String marca = ss.nextLine();
                                System.out.println("Tipo de objeto ");
                                String noun = ss.nextLine();
				System.out.println("Precio (sin símbolos) ");
                                int num = ss.nextInt();
                                lista.add(new Equipamiento(nombre , marca , num , noun ));
                                break;
			case 4:
				System.out.println("Indique la fila que desea eliminar del catalogo");
				Scanner wt = new Scanner(System.in);
				int ind = wt.nextInt();
				if(ind > 0){
				lista.remove(ind - 1);
				}else{
					System.out.println("Fila inexistente, pruebe con otra");
				}
				break;

			case 5:
				Scanner rt = new Scanner(System.in);
				System.out.println("Nombre del prodructo ");
                               	String nombrenn = rt.nextLine();
                               	System.out.println("Nombre de la marca ");
                               	String marcann = rt.nextLine();
                               	System.out.println("Talla de la prenda ");
                               	String nounnn = rt.nextLine();
                               	System.out.println("Precio (sin símbolos) ");
                              	int numnn = rt.nextInt();
                               	System.out.println("Indique la fila que desea modificar del catalogo");
                                int indm = rt.nextInt();
				lista.remove(indm -1);
				lista.add(indm - 1, new Ropa(nombrenn , marcann , numnn , nounnn ));
				System.out.println("Modificado =)");
				break;
			case 6:
				Scanner tr = new Scanner(System.in);
                                System.out.println("Nombre del prodructo ");
                                String nombren = tr.nextLine();
                                System.out.println("Nombre de la marca ");
                                String marcan = tr.nextLine();
                                System.out.println("Tipo de objeto ");
                                String nounn = tr.nextLine();
                                System.out.println("Precio (sin símbolos) ");
                                int numn = tr.nextInt();
                                System.out.println("Indique la fila que desea modificar del catalogo");
                                int indd = tr.nextInt();
                                lista.remove(indd -1);
                                lista.add(indd - 1, new Ropa(nombren , marcan , numn , nounn ));
                                System.out.println("Modificado");
                                break;

			case 7:
			
						
	                        for (Item texto2 : bajas){

                                System.out.println(texto2);
                      		}
              	                break;
			case 8:
				Scanner ss2 = new Scanner(System.in);
                               	System.out.println("Indique la fila de la lista de bajas que desea añadir al catálogo");
				int idb2 = ss2.nextInt();
				lista.add(bajas.get(idb2 - 1));
				bajas.remove(idb2 - 1);
                               	break;	
			case 9:
				Scanner ss3 = new Scanner(System.in);
                                System.out.println("Indique la fila del catálogo que desea añadir a la lista de bajas");
                                int idb3 = ss3.nextInt();
				bajas.add(lista.get(idb3 - 1));
				lista.remove(idb3 - 1);
				break;
				
				//}
			case 10: 
				salir = true;

			default: System.out.println("Saliendo...");break;
			}
			}
			
	 }
}
