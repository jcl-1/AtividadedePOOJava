public class Main {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone("iPhone 14", 6000.00, 10, 4000);
        Televisao televisao = new Televisao("Smart TV Samsung", 3500.00, 5, 55);
        Notebook notebook = new Notebook("Dell Inspiron", 4500.00, 8, 512);

        Loja loja = new Loja();
        loja.adicionarProduto(smartphone);
        loja.adicionarProduto(televisao);
        loja.adicionarProduto(notebook);


        loja.listarProdutos();


        loja.aplicarDescontoGeral(10);

        loja.listarProdutos();
    }
}
