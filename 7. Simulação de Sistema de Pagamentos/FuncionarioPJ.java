class FuncionarioPJ extends Funcionario {
    private int horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioPJ(String nome, String cpf, double valorPorHora, int horasTrabalhadas) {
        super(nome, cpf, 0);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorPorHora;
    }
}
