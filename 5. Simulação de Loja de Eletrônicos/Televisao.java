public class Televisao extends Produto {
    private double tamanhoDaTela;


    public Televisao(String nome, double preco, int quantidadeEmEstoque, double tamanhoDaTela) {
        super(nome, preco, quantidadeEmEstoque);
        this.tamanhoDaTela = tamanhoDaTela;
    }

    @Override
    public void exibirProduto() {
        super.exibirProduto();
        System.out.println("Tamanho da tela: " + tamanhoDaTela + " polegadas");
    }
}
