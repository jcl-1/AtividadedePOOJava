import java.util.ArrayList;
import java.util.List;

class FolhaDePagamento {
    private List<Funcionario> funcionarios;

    public FolhaDePagamento() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void calcularPagamentos() {
        System.out.println("Pagamentos dos Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + " - Pagamento: R$ " + funcionario.calcularPagamento());
        }
    }
}
