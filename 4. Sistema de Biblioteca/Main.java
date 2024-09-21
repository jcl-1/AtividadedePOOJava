public class Main{
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-8578273696");
        Livro livro2 = new Livro("Harry Potter", "J.K. Rowling", "978-0439139601");
        Livro livro3 = new Livro("1984", "George Orwell", "978-0451524935");
        Livro livro4 = new Livro("Dom Casmurro", "Machado de Assis", "978-8572326174");

        Usuario usuario1 = new Usuario("Julio","123.456.789-00");
        Usuario usuario2 = new Usuario("Ana","987.654.321-00");

        Emprestimo emprestimo1 = new Emprestimo(usuario1, livro1);
        Emprestimo emprestimo2 = new Emprestimo(usuario1, livro2);
        Emprestimo emprestimo3 = new Emprestimo(usuario1, livro3);
        Emprestimo emprestimo4 = new Emprestimo(usuario1, livro4);

        emprestimo1.realizarEmprestimo();
        emprestimo2.realizarEmprestimo();
        emprestimo3.realizarEmprestimo();
        emprestimo4.realizarEmprestimo();

        Emprestimo emprestimo5 = new Emprestimo(usuario2, livro1);
        emprestimo5.realizarEmprestimo(); //Esse falha

        emprestimo5.realizarDevolucao();

        emprestimo5.realizarEmprestimo();
    }
}