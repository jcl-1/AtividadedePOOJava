import java.text.DecimalFormat;

public class ContaBancaria {
    private Cliente titular;
    private double saldo;
    private int numeroDaConta;

    public ContaBancaria(Cliente titular, int numeroDaConta) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0.0; // Saldo inicial
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque inválido. Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirExtrato() {
        System.out.println("Extrato da Conta");
        System.out.println("Titular: " + titular.getNome());
        System.out.println("CPF: " + titular.getCpf());
        System.out.println("Número da Conta: " + numeroDaConta);
        System.out.println("Saldo: R$" + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }
}
