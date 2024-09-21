import java.util.ArrayList;

public class Loja {
    private ArrayList<Produto> estoque;

    public Loja() {
        this.estoque = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
    }

    public void listarProdutos() {
        System.out.println("Lista de produtos disponíveis:");
        for (Produto produto : estoque) {
            produto.exibirProduto();
            System.out.println("******************************");
        }
    }

    public void aplicarDescontoGeral(double porcentagem) {
        for (Produto produto : estoque) {
            produto.aplicarDesconto(porcentagem);
        }
        System.out.println("Desconto de " + porcentagem + "% aplicado a todos os produtos.");
    }
}
