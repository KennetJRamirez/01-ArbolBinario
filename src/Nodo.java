public class Nodo {
    //Atribs
    public int dato;
    public Nodo izquierda;
    public Nodo derecha;
    public Nodo padre;

    public Nodo(int dato){
        this.dato=dato;
        this.izquierda=null;
        this.derecha=null;
        this.padre=null;
    }

}
