public class Arbol {
    public Nodo raiz;

    public Arbol(){
        raiz=null;
    }

    public void insertar(int dato){
        Nodo nuevo= new Nodo(dato);
        if(raiz==null){
            raiz=nuevo;
        }else{
            Nodo actual= raiz;
            Nodo padre;
            while(true){
                padre=actual;
                if(dato< actual.dato){
                    actual=actual.izquierda;
                    if(actual==null){
                        padre.izquierda=nuevo;
                        padre=padre;
                        return;
                    }
                }else{
                    actual=actual.derecha;
                    if(actual==null){
                        padre.derecha=nuevo;
                        padre=padre;
                        return;
                    }
                }
            }
        }
    }

    public void inOrden(Nodo nodo){
        if(nodo!=null){
            inOrden(nodo.izquierda);
            System.out.print(nodo.dato+" ");
            inOrden(nodo.derecha);
        }
    }

    public void preOrden(Nodo nodo){
        if(nodo!=null){
            System.out.print(nodo.dato+" ");
            preOrden(nodo.izquierda);
            preOrden(nodo.derecha);
        }
    }

    public void postOrden(Nodo nodo){
        if(nodo!=null){
            postOrden(nodo.izquierda);
            postOrden(nodo.derecha);
            System.out.print(nodo.dato+" ");
        }
    }


}
