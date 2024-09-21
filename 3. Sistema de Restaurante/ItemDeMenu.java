public class ItemDeMenu {
    private String descricao;
    private double preco;

    public ItemDeMenu(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println(descricao + " - R$ " + String.format("%.2f", preco));
    }
}
