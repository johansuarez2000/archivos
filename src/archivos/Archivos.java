/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author crramirezma
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File j=new File("entrada.txt");
        Scanner entrada=null;
        ArrayList<Liga>ligas=new ArrayList<>();
        int numLigas=0;
        String nombreLiga;
        int numEquipos=0;
        String nombreEquipo;
        
        try {
            if(j.exists()){
                entrada=new Scanner(j);
                
                if(entrada.hasNext()){
                    numLigas=entrada.nextInt();
                    for (int i = 0; i < numLigas; i++) {
                        nombreLiga=entrada.next();
                        Liga liga=new Liga(nombreLiga);
                        numEquipos=entrada.nextInt();
                        for (int k = 0; k < numEquipos; k++) {
                            nombreEquipo=entrada.next();
                            if(liga.addEquipo(nombreEquipo)){
                                System.out.println("Equipo registrado");
                            }
                        }
                        ligas.add(liga);
                    }
                } 
                File salida =new File("salida.txt");
                if(!salida.exists()){
                    salida.createNewFile();
                }
                PrintStream flujoSalida=new PrintStream(salida);
                for(Liga liga:ligas){
                    for(Equipo equipo:liga.getEquipos()){
                        flujoSalida.println(equipo.getNombre());
                    }
                }
                flujoSalida.flush();
                flujoSalida.close();
            }else{
                System.out.println("el archivo no existe");
            }
        } catch (FileNotFoundException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
