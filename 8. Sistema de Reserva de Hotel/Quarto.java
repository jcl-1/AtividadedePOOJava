import java.util.Date;
import java.util.Calendar;

public class Quarto {
    private int numero; // O número do quarto
    private String tipo; // O tipo do quarto (individual, casal, etc.)
    private boolean disponibilidade; // Se o quarto está disponível ou não

    // Construtor para criar o quarto
    public Quarto(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.disponibilidade = true; // Por padrão, o quarto está disponível!
    }

    // Métodos para acessar e modificar as informações
    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void reservar() {
        disponibilidade = false; // O quarto não está mais disponível
    }

    public void liberar() {
        disponibilidade = true; // O quarto está de volta disponível
    }
}
