import java.util.ArrayList;

public class Frota {
    private ArrayList<Veiculo> listaDeVeiculos;

    public Frota() {
        this.listaDeVeiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        listaDeVeiculos.add(veiculo);
        System.out.println("Veículo adicionado à frota: " + veiculo.getModelo());
    }

    public void listarVeiculos() {
        System.out.println("\nLista de Veículos na Frota:");
        for (Veiculo veiculo : listaDeVeiculos) {
            veiculo.exibirDetalhes();
            System.out.println();
        }
    }
}
