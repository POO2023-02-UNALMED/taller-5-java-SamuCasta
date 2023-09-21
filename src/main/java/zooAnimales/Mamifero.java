package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	
	private static ArrayList<Mamifero> lista = new ArrayList<Mamifero>();
	private static Mamifero[] listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(){
		totalAnimales++;
		lista.add(this);
		}
	
	  public Mamifero(String nombre1,int edad1, String habitat1,String genero1, boolean pelaje1, int patas1){
	    super.setNombre(nombre1);
	    super.setEdad(edad1);
	    super.setHabitat(habitat1);
	    super.setGenero(genero1);
	    this.pelaje=pelaje1;
	    this.patas=patas1;
	    lista.add(this);
	    totalAnimales++;
	  }
	  
	  public static int cantidadMamiferos(){
		  return lista.size();
		  }
	  

}
