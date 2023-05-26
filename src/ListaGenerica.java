import java.util.ArrayList;

public class ListaGenerica <t> {
    private ArrayList <t> lista = new ArrayList<>();

    public ArrayList<t> getLista() {
        return lista;
    }

    public void setLista(ArrayList<t> lista) {
        this.lista = lista;
    }
    public void agregarElementos (t elemento)
    {
        lista.add(elemento);
    }
    public int tamanioLista ()
    {
        return lista.size();
    }
    public boolean obtenerElemento (int pos)
    {
        boolean seEncontro = false;
        int cont = 0;

        for (t ej: lista)
        {
            if (cont == pos)
            {
                seEncontro = true;
                System.out.println(ej);
            }
            else
            {
                cont++;
            }
        }
        return seEncontro;
    }
    public void intercambiarElementos (t elemento1, t elemento2)
    {
        t aux = elemento1;
        elemento1 = elemento2;
        elemento2 = aux;
        System.out.println("Elemento1: " + elemento1);
        System.out.println("Elemento2: " + elemento2);
    }
    public boolean comparar (t elemento1, t elemento2)
    {
        boolean iguales = false;
        if (elemento1.equals(elemento2))
        {
            iguales = true;
        }
        return iguales;
    }
}
