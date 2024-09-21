public class SistemaVotacao {
    public static void main(String[] args) {

        UrnaEletronica urna = new UrnaEletronica();

        Candidato candidato1 = new Candidato("Bolsonaro", "PL");
        Candidato candidato2 = new Candidato("Lula", "PT");
        urna.adicionarCandidato(candidato1);
        urna.adicionarCandidato(candidato2);


        Eleitor eleitor1 = new Eleitor("Julio", "12345678901");
        Eleitor eleitor2 = new Eleitor("Marcos", "98765432100");
        Eleitor eleitor3 = new Eleitor("Vinícius", "12345678901");

        urna.votar(eleitor1, candidato1);
        urna.votar(eleitor2, candidato2);
        urna.votar(eleitor3, candidato1);
        
        urna.exibirResultados();
    }
}
