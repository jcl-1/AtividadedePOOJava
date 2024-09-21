public class SimulacaoPagamento {
    public static void main(String[] args) {

        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();

        Funcionario clt1 = new FuncionarioCLT("Julio", "12345678900", 5000);
        Funcionario pj1 = new FuncionarioPJ("Maria", "98765432100", 50, 160);

        folhaDePagamento.adicionarFuncionario(clt1);
        folhaDePagamento.adicionarFuncionario(pj1);

        folhaDePagamento.calcularPagamentos();
    }
}
