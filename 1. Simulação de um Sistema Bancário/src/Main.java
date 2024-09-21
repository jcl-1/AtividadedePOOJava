public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Julio Cesar de Lima", "123.456.789-00");

        ContaBancaria conta1 = new ContaBancaria(cliente1, 1001);

        conta1.exibirExtrato();

        conta1.depositar(500.0);
        conta1.sacar(200.0);

        conta1.exibirExtrato();
    }
}
