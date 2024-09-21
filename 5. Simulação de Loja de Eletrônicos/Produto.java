public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEmEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > this.quantidadeEmEstoque) {
            System.out.println("Quantidade insuficiente em estoque.");
        } else {
            this.quantidadeEmEstoque -= quantidade;
        }
    }

    public void aplicarDesconto(double porcentagem) {
        this.preco -= this.preco * (porcentagem / 100);
    }

    public void exibirProduto() {
        System.out.println("Nome: " + nome + ", Preço: R$ " + preco + ", Estoque: " + quantidadeEmEstoque);
    }
}
