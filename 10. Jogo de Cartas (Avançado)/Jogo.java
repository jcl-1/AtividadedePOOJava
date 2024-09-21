import java.util.Random;

class Jogo {
    private Baralho baralho;
    private Jogador jogador1;
    private Jogador jogador2;

    public Jogo(String nomeJogador1, String nomeJogador2) {
        baralho = new Baralho();
        baralho.embaralhar();
        jogador1 = new Jogador(nomeJogador1);
        jogador2 = new Jogador(nomeJogador2);
    }

    public void iniciar() {

        for (int i = 0; i < 5; i++) {
            jogador1.adicionarCarta(baralho.comprarCarta());
            jogador2.adicionarCarta(baralho.comprarCarta());
        }

        Carta cartaJogador1 = jogador1.revelarCarta();
        Carta cartaJogador2 = jogador2.revelarCarta();

        System.out.println(jogador1.getNome() + " revela: " + cartaJogador1);
        System.out.println(jogador2.getNome() + " revela: " + cartaJogador2);

        String vencedor = determinarVencedor(cartaJogador1, cartaJogador2);
        System.out.println("O vencedor é: " + vencedor);
    }

    private String determinarVencedor(Carta carta1, Carta carta2) {
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei", "Ás"};
        int valor1 = encontrarValor(carta1.getValor(), valores);
        int valor2 = encontrarValor(carta2.getValor(), valores);

        if (valor1 > valor2) {
            return jogador1.getNome();
        } else if (valor1 < valor2) {
            return jogador2.getNome();
        } else {
            return "Empate!";
        }
    }

    private int encontrarValor(String valor, String[] valores) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i].equals(valor)) {
                return i;
            }
        }
        return -1;
}
