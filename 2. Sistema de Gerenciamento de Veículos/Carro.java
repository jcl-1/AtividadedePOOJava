public class Carro extends Veiculo {
    private String tipoCombustivel;

    public Carro(String placa, String modelo, double quilometragem, String tipoCombustivel) {
        super(placa, modelo, quilometragem);
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
    }
}
