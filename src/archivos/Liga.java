/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;
import java.util.*;
import java.util.logging.Logger;
/**
 *
 * @author crramirezma
 */
public class Liga {
    private String nombre;
    private ArrayList<Equipo>equipos;
    public Liga(String nombre){
        this.nombre=nombre;
        equipos=new ArrayList<>();
    }
    
    public boolean addEquipo(String nombre){
        Equipo equipo=new Equipo(nombre);
        return this.equipos.add(equipo);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
    
    
    
}
