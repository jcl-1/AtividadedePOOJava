import java.util.Date;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private Date dataEmprestimo;
    private Date dataDevolucao;


    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = new Date();
        this.dataDevolucao = null;
    }


    public void realizarEmprestimo() {
        if (livro.isEmprestado()) {
            System.out.println("O livro '" + livro.getTitulo() + "' já está emprestado.");
        } else if (!usuario.podePegarLivro()) {
            System.out.println("O usuário " + usuario.getNome() + " já atingiu o limite de 3 livros.");
        } else {
            livro.emprestar();
            usuario.adicionarLivro(livro);
            System.out.println("Empréstimo realizado: " + livro.getTitulo() + " para " + usuario.getNome());
        }
    }


    public void realizarDevolucao() {
        if (!livro.isEmprestado()) {
            System.out.println("O livro '" + livro.getTitulo() + "' não está emprestado.");
        } else {
            livro.devolver();
            usuario.devolverLivro(livro);
            this.dataDevolucao = new Date();
            System.out.println("Livro '" + livro.getTitulo() + "' devolvido por " + usuario.getNome());
        }
    }
}
