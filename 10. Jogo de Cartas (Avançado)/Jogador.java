import java.util.ArrayList;
import java.util.List;

class Jogador {
    private String nome;
    private List<Carta> mao;

    public Jogador(String nome) {
        this.nome = nome;
        this.mao = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarCarta(Carta carta) {
        mao.add(carta);
    }

    public Carta revelarCarta() {
        return mao.isEmpty() ? null : mao.remove(0);
    }

    public int quantidadeCartas() {
        return mao.size();
    }

    public List<Carta> getMao() {
        return mao;
    }
}
