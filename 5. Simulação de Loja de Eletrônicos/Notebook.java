public class Notebook extends Produto {
    private int capacidadeDeArmazenamento;


    public Notebook(String nome, double preco, int quantidadeEmEstoque, int capacidadeDeArmazenamento) {
        super(nome, preco, quantidadeEmEstoque);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    @Override
    public void exibirProduto() {
        super.exibirProduto();
        System.out.println("Capacidade de armazenamento: " + capacidadeDeArmazenamento + " GB");
    }
}
