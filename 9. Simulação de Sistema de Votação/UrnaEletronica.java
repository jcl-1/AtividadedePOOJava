import java.util.ArrayList;
import java.util.List;

class UrnaEletronica {
    private List<Candidato> candidatos;
    private List<Eleitor> eleitoresVotaram;

    public UrnaEletronica() {
        candidatos = new ArrayList<>();
        eleitoresVotaram = new ArrayList<>();
    }

    public void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    public boolean votar(Eleitor eleitor, Candidato candidato) {
        if (eleitoresVotaram.contains(eleitor)) {
            System.out.println("Eleitor já votou.");
            return false;
        }

        candidato.adicionarVoto();
        eleitoresVotaram.add(eleitor);
        System.out.println(eleitor.getNome() + " votou em " + candidato.getNome());
        return true;
    }

    public void exibirResultados() {
        System.out.println("Resultados da Eleição:");
        for (Candidato candidato : candidatos) {
            System.out.println(candidato);
        }
    }
}
