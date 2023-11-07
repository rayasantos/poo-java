import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Arte> itens = new ArrayList<>();
    private double total;

    public void adicionarItem(Arte arte) {
        itens.add(arte);
        total += arte.getPreco();
    }

    public void removerItem(Arte arte) {
        itens.remove(arte);
        total -= arte.getPreco();
    }

    public double calcularTotal() {
        return total;
    }
}
