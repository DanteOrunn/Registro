package utilidad;

public class Nodo {
   
    private String informacion;
    private Nodo siguiente;

    public Nodo(){
        
    }

    public Nodo(String informacion){
        this.informacion = informacion;
        this.siguiente = null;
    }

    public String getInformacion(){
        return informacion;
    }

    public void setInformacion(String informacion){
        this.informacion = informacion;
    }

    public Nodo getNodo(){
        return siguiente;
    }

    public void setNodo(Nodo siguiente){
        this.siguiente = siguiente;
    }

}
