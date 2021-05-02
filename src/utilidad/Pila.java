package utilidad;

public class Pila {
    
    private Nodo ultimoDato;
    private int tamaño;

    public Pila(){
        ultimoDato = null;
        tamaño = 0;
    }

    //Metodo para saber si la pila esta vacia
    public boolean pilaVacia(){
        return ultimoDato == null;
    }

    //Metodo para insertar un nodo
    public void insertarNodo(String informacion){
        Nodo nuevoNodo = new Nodo(informacion);
        nuevoNodo.setInformacion(informacion);
        this.tamaño++;
    }

    //Metodo para eliminar un nodo
    public String eliminarNodo(){
        String aux = ultimoDato.getInformacion();
        ultimoDato = ultimoDato.getNodo();
        tamaño--;
        return aux;
    }

    //Mostrar ultimo valor ingresado a la pila
    public String ultimoValorIngresado(){
        return ultimoDato.getInformacion();
    }

    //Metodo para saber el tamaño de la pila
    public int mostrarTamaño(){
        return tamaño;
    }

    //Metodo para vaciar la pila
    public void vaciarPila(){
        while (!pilaVacia()) {
            eliminarNodo();
        }
    }

    //Metodo para mostrar los valores de la pila
    public void mostrarValores(){
        String aux = "";
        Nodo recorrido = this.ultimoDato;

        while (recorrido != null) {
            aux = recorrido.getInformacion() + "\n";
            recorrido = recorrido.getNodo();
        }

        System.out.println(aux);
    }

}
