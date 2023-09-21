package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private List<Zona> zonass = new ArrayList<Zona>();
	Zona[] zonas;
	
	public Zoologico(){}

	public Zoologico(String nombre1, String ubicacion1) {
        this.nombre = nombre1;
        this.ubicacion = ubicacion1;
        this.zonas = new Zona[10];
        
	}
        
        public void agregarZonas(Zona NuevaZona) {
            zonass.add(NuevaZona); 
	}
        
        public int cantidadTotalAnimales() {
            int totalAnimales = 0;
            for (Zona i : zonas) {
                totalAnimales += i.cantidadAnimales();
            }
            return totalAnimales;
        }
        
        public String getNombre(){
        	return nombre;
        	}
        public String getUbicacion()
        {return ubicacion;
        }
        public List<Zona> getZona(){
        	return zonass;
        	}
}
