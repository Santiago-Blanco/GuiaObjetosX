import java.util.ArrayList;
import java.util.Stack;

public class PilaGenerica <T extends Number>{
    private Stack <T> Pila = new Stack<>();

    public Stack<T> getPila() {
        return Pila;
    }
    public void setPila(Stack<T> pila) {
        Pila = pila;
    }
    public void agregar (T num)
    {
        Pila.push(num);
    }
}
