import java.util.ArrayList;

public class SistemaRestaurante {
    private ArrayList<Pedido> pedidos;


    public SistemaRestaurante() {
        pedidos = new ArrayList<>();
    }


    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido nº " + pedido.getNumeroDoPedido() + " adicionado.");
    }


    public void listarPedidos() {
        System.out.println("\nLista de todos os pedidos:");
        for (Pedido pedido : pedidos) {
            pedido.exibirPedido();
        }
    }
}
