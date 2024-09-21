public class Caminhao extends Veiculo {
    private double capacidadeDeCarga;

    public Caminhao(String placa, String modelo, double quilometragem, double capacidadeDeCarga) {
        super(placa, modelo, quilometragem);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: " + capacidadeDeCarga + " toneladas");
    }
}
