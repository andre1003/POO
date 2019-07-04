public class Time{
    private String nome;
    private String sigla;
    private int pontos;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int gols_marcados;
    private int gols_sofridos;
    private int cartao_amarelo;
    private int cartao_vermelho;

    public Time(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
        this.pontos = 0;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
        this.gols_marcados = 0;
        this.gols_sofridos = 0;
        this.cartao_amarelo = 0;
        this.cartao_vermelho = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getGolsMarcados() {
        return gols_marcados;
    }

    public void setGolsMarcados(int gols_marcados) {
        this.gols_marcados = gols_marcados;
    }

    public int getGolsSofridos() {
        return gols_sofridos;
    }

    public void setGolsSofridos(int gols_sofridos) {
        this.gols_sofridos = gols_sofridos;
    }

    public int getCartaoAmarelo() {
        return cartao_amarelo;
    }

    public void setCartaoAmarelo(int cartao_amarelo) {
        this.cartao_amarelo = cartao_amarelo;
    }

    public int getCartaoVermelho() {
        return cartao_vermelho;
    }

    public void setCartaoVermelho(int cartao_vermelho) {
        this.cartao_vermelho = cartao_vermelho;
    }
}