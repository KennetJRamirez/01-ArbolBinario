public class Main {
    public static void main(String[] args) {
        Arbol arbol= new Arbol();

        arbol.insertar(15);
        arbol.insertar(24);
        arbol.insertar(79);
        arbol.insertar(99);
        arbol.insertar(30);
        arbol.insertar(66);
        arbol.insertar(88);

        System.out.println("    Desplegando datos");
        System.out.print("Inorden: ");
        arbol.inOrden(arbol.raiz);
        System.out.println();

        System.out.print("Preorden: ");
        arbol.preOrden(arbol.raiz);
        System.out.println();

        System.out.print("Postorden: ");
        arbol.postOrden(arbol.raiz);
        System.out.println();
    }
}
