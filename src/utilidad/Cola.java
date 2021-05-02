package utilidad;

public class Cola {
    
    private Nodo inicioCola;
    private Nodo finalCola;
    private int tamaño;

    public Cola(){
        this.inicioCola = null;
        this.finalCola = null;
        this.tamaño = 0;
    }

    //Metodo para saber si la cola esta vacia
    public boolean colaVacia(){
        return inicioCola == null;
    }

    //Metodo para insertar un elemento a la cola
    public void insertar(String informacion){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setInformacion(informacion);
        nuevoNodo.setNodo(null);

        if (colaVacia()) {
            this.inicioCola = nuevoNodo;
            this.finalCola = nuevoNodo;
        } else {
            
        }
    }

}
