public class Smartphone extends Produto {
    private int capacidadeDaBateria;

    public Smartphone(String nome, double preco, int quantidadeEmEstoque, int capacidadeDaBateria) {
        super(nome, preco, quantidadeEmEstoque);
        this.capacidadeDaBateria = capacidadeDaBateria;
    }

    @Override
    public void exibirProduto() {
        super.exibirProduto();
        System.out.println("Capacidade da bateria: " + capacidadeDaBateria + "mAh");
    }
}
