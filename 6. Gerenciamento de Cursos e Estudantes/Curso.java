import java.util.ArrayList;
import java.util.List;

class Curso {
    private String nome;
    private String codigo;
    private int duracao;
    private List<Estudante> estudantes;

    public Curso(String nome, String codigo, int duracao) {
        this.nome = nome;
        this.codigo = codigo;
        this.duracao = duracao;
        this.estudantes = new ArrayList<>();
    }

    // Método para matricular um estudante no curso
    public void matricularEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public void listarEstudantes() {
        if (estudantes.isEmpty()) {
            System.out.println("Nenhum estudante matriculado no curso " + nome);
        } else {
            System.out.println("Estudantes matriculados no curso " + nome + ":");
            for (Estudante estudante : estudantes) {
                System.out.println(estudante);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getDuracao() {
        return duracao;
    }
}
