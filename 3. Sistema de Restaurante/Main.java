public class Main {
    public static void main(String[] args) {

        ItemDeMenu item1 = new ItemDeMenu("Pizza de Calabresa", 30.00);
        ItemDeMenu item2 = new ItemDeMenu("Refrigerante", 5.00);
        ItemDeMenu item3 = new ItemDeMenu("Sobremesa: Pudim", 10.00);
        ItemDeMenu item4 = new ItemDeMenu("Hambúrguer", 25.00);
        ItemDeMenu item5 = new ItemDeMenu("Batata Frita", 8.00);


        SistemaRestaurante sistemaRestaurante = new SistemaRestaurante();


        Pedido pedido1 = new Pedido(101);
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);
        sistemaRestaurante.adicionarPedido(pedido1);


        Pedido pedido2 = new Pedido(102);
        pedido2.adicionarItem(item3);
        pedido2.adicionarItem(item4);
        pedido2.adicionarItem(item5);
        sistemaRestaurante.adicionarPedido(pedido2);


        sistemaRestaurante.listarPedidos();
    }
}
