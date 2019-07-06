public class Time{
    private String nome;
    private String sigla;
    private int partidas;
    private int pontos;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int gols_marcados;
    private int gols_sofridos;
    private int cartao_amarelo;
    private int cartao_vermelho;

    public Time(String nome, String sigla){ // Construtor
        this.nome = nome;
        this.sigla = sigla;
        this.partidas = 0;
        this.pontos = 0;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
        this.gols_marcados = 0;
        this.gols_sofridos = 0;
        this.cartao_amarelo = 0;
        this.cartao_vermelho = 0;
    }

    public String getNome() { // Método get para nome
        return nome;
    }

    public void setNome(String nome) { // Método set para nome
        this.nome = nome;
    }

    public String getSigla() { // Método get para sigla
        return sigla;
    }

    public void setSigla(String sigla) { // Método set para sigla
        this.sigla = sigla;
    }

    public int getPartidas(){ // Método get para partidas
        return partidas;
    }

    public void setPartidas(int partidas){ // Método set para partidas
        this.partidas = partidas;
    }

    public int getPontos() { // Método get para pontos
        return pontos;
    }

    public void setPontos(int pontos) { // Método set para pontos
        this.pontos = pontos;
    }

    public int getVitorias() { // Método get para vitórias
        return vitorias;
    }

    public void setVitorias(int vitorias) { // Método set para vitórias
        this.vitorias = vitorias;
    }

    public int getEmpates() { // Método get para empates
        return empates;
    }

    public void setEmpates(int empates) { // Método set para empates
        this.empates = empates;
    }

    public int getDerrotas() { // Método get para derrotas
        return derrotas;
    }

    public void setDerrotas(int derrotas) { // Método set para derrotas
        this.derrotas = derrotas;
    }

    public int getGolsMarcados() { // Método get para gols marcados
        return gols_marcados;
    }

    public void setGolsMarcados(int gols_marcados) { // Método set para gols marcados
        this.gols_marcados = gols_marcados;
    }

    public int getGolsSofridos() { // Método get para gols sofridos
        return gols_sofridos;
    }

    public void setGolsSofridos(int gols_sofridos) { // Método set para gols sofridos
        this.gols_sofridos = gols_sofridos;
    }

    public int getCartaoAmarelo() { // Método get para cartões amarelos
        return cartao_amarelo;
    }

    public void setCartaoAmarelo(int cartao_amarelo) { // Método set para cartões amarelos
        this.cartao_amarelo = cartao_amarelo;
    }

    public int getCartaoVermelho() { // Método get para cartões vermelhos
        return cartao_vermelho;
    }

    public void setCartaoVermelho(int cartao_vermelho) { // Método set para cartões vermelhos
        this.cartao_vermelho = cartao_vermelho;
    }
}