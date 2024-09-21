public class Main {
    public static void main(String[] args) {

        Frota frota = new Frota();

        Caminhao caminhao1 = new Caminhao("ABC-1234", "Caminhão Ford", 150000.0, 10.0);
        frota.adicionarVeiculo(caminhao1);

        Carro carro1 = new Carro("XYZ-5678", "Carro Honda Civic", 50000.0, "Gasolina");
        frota.adicionarVeiculo(carro1);

        frota.listarVeiculos();
    }
}
