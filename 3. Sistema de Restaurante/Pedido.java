import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Pedido {
    private int numeroDoPedido;
    private Date data;
    private ArrayList<ItemDeMenu> itens;
    private double valorTotal;


    public Pedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
        this.data = new Date();  // Data atual
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0;
    }


    public void adicionarItem(ItemDeMenu item) {
        itens.add(item);
        calcularValorTotal();  // Atualiza o valor total do pedido
        System.out.println("Item adicionado: " + item.getDescricao());
    }


    public void removerItem(ItemDeMenu item) {
        if (itens.remove(item)) {
            calcularValorTotal();  // Atualiza o valor total do pedido
            System.out.println("Item removido: " + item.getDescricao());
        } else {
            System.out.println("Item não encontrado no pedido.");
        }
    }


    private void calcularValorTotal() {
        valorTotal = 0.0;
        for (ItemDeMenu item : itens) {
            valorTotal += item.getPreco();
        }
    }


    public void exibirPedido() {

        SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM/yyyy HH:mm", new Locale("pt", "BR"));

        System.out.println("\nPedido nº: " + numeroDoPedido);
        System.out.println("Data: " + formatoBrasileiro.format(data));
        System.out.println("Itens do pedido:");
        for (ItemDeMenu item : itens) {
            item.exibirDetalhes();
        }
        System.out.println("Valor Total: R$ " + String.format("%.2f", valorTotal));
    }


    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }
}
