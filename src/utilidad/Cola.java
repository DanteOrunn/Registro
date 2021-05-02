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

    

}
