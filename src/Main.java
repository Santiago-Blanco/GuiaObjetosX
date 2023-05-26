public class Main {
    public static void main(String[] args) {
        ListaGenerica <String> lista = new ListaGenerica<>();

        lista.agregarElementos("Lauti");

        int tamanio = lista.tamanioLista();
        System.out.println("Tamaño de la lista: " + tamanio);

        boolean seEncontro = lista.obtenerElemento(0);
        if (!seEncontro)
        {
            System.out.println("No se encontro ningun elemento en esa posicion");
        }

    }
}