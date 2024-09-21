import java.util.Date;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        // Criar alguns quartos
        Quarto quarto1 = new Quarto(101, "Individual");
        Quarto quarto2 = new Quarto(102, "Casal");

        // Criar um cliente
        Cliente cliente = new Cliente("Maria", "123456789");

        // Criar um objeto Calendar para definir as datas
        Calendar calendar = Calendar.getInstance();

        // Definir data de entrada
        calendar.set(2023, Calendar.OCTOBER, 1);
        Date dataEntrada = calendar.getTime();

        // Definir data de saída
        calendar.set(2023, Calendar.OCTOBER, 5);
        Date dataSaida = calendar.getTime();

        // Criar a reserva
        Reserva reserva = new Reserva(quarto1, cliente, dataEntrada, dataSaida);

        // Calcular o valor da estadia
        double valorEstadia = reserva.calcularValorEstadia(100.0); // Cada dia custa 100
        System.out.println("Valor da Estadia: R$ " + valorEstadia);
    }
}