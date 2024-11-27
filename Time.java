// Classe que representa um objeto do mundo real: Time de futebol

public class Time {
    
    // Propriedades do time
    private String nome;
    private String cores;
    private int anoFundacao;

    // Construtor para inicializar as propriedades do Time
    public Time(String nome, String cores, int anoFundacao) {
            this.nome = nome;
            this.cores = cores;
            this.anoFundacao = anoFundacao;
    }

    // Método para obter o nome do time
    public String getNome() {
        return nome; 
    }

    // Método para definir o nome do time
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter a cor do time
    public String getCores() {
        return cores;
    }

    // Método para definir a cor do time
    public void setCores(String cores) {
        this.cores = cores;
    }

    // Método para obter o ano de fundação do time
    public int getAnoFundacao() {
        return anoFundacao;
    }

    // Método para definir o ano de fundação do time
    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    // Método para exibir as informações do time
    public void exibirInformacoes() {
        System.out.println("Nome:" + nome);
        System.out.println("Cores:" + cores);
        System.out.println("Ano de Fundação" + anoFundacao);
    }

    // Método para testar a classe time
    public static void main(String[] args) {
        // Criando objeto time
        Time meuTime = new Time("Flamengo", "Vermelho e Preto", 1895 );

        //exibindo informações do time
        meuTime.exibirInformacoes();
    }
}