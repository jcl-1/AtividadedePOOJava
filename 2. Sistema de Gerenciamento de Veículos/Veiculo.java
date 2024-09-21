public class Veiculo {
    private String placa;
    private String modelo;
    private double quilometragem;

    public Veiculo(String placa, String modelo, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Quilometragem: " + quilometragem + " km");
    }
}
