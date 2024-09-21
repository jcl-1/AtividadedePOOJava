public class Cliente {
    private String nome; // Nome do cliente
    private String documento; // Documento do cliente (pode ser CPF ou algo assim)

    // Construtor para criar o cliente
    public Cliente(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    // Métodos para acessar as informações
    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }
}
