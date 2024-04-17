
package herencia.java;


public class Humano {
    
    private String nombre;
    
    public void comer(String nombre){
        System.out.println(nombre+" Esta comiendo desde la Clase Humano");
    }
    public void dormir(){
        System.out.println(nombre+ " Esta Durmiendo desde la Clase Humano");
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
        
    }
}