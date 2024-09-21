import java.util.Date;
import java.util.Calendar;
public class Reserva {
    private Quarto quarto; // O quarto reservado
    private Cliente cliente; // O cliente que fez a reserva
    private Date dataEntrada; // Quando o cliente chega
    private Date dataSaida; // Quando o cliente sai

    // Construtor para criar a reserva
    public Reserva(Quarto quarto, Cliente cliente, Date dataEntrada, Date dataSaida) {
        this.quarto = quarto;
        this.cliente = cliente;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        quarto.reservar(); // Reservamos o quarto!
    }

    // Método para calcular o valor da estadia
    public double calcularValorEstadia(double precoPorDia) {
        long dias = (dataSaida.getTime() - dataEntrada.getTime()) / (1000 * 60 * 60 * 24);
        return dias * precoPorDia; // Retorna o valor total
    }
}
