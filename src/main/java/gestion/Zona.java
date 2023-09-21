package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public Zona() {
	}
	
	public Zona (String nombre1, Zoologico zoo1) {
        this.nombre = nombre1;
        this.zoo = zoo1;
        this.animales = new ArrayList<Animal>();
	}
	
	public void agregarAnimales(Animal NuevoAnimal) {
        animales.add(NuevoAnimal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
	public ArrayList<Animal> getAnimales() {
		return animales;
		}
	  public String getNombre(){
		  return nombre;
		  }
	  public Zoologico getZoo(){
		  return zoo;
		  } 
}
