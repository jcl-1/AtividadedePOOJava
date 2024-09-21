import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String cpf;
    private ArrayList<Livro> livrosEmprestados;


    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.livrosEmprestados = new ArrayList<>();
    }


    public String getNome() {
        return nome;
    }


    public boolean podePegarLivro() {
        return livrosEmprestados.size() < 3;
    }


    public void adicionarLivro(Livro livro) {
        if (podePegarLivro()) {
            livrosEmprestados.add(livro);
        } else {
            System.out.println("Usuário já possui 3 livros emprestados.");
        }
    }


    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }
}
