class Candidato {
    private String nome;
    private String partido;
    private int votos;

    public Candidato(String nome, String partido) {
        this.nome = nome;
        this.partido = partido;
        this.votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return partido;
    }

    public int getVotos() {
        return votos;
    }

    public void adicionarVoto() {
        votos++;
    }

    @Override
    public String toString() {
        return nome + " (" + partido + ") - Votos: " + votos;
    }
}
