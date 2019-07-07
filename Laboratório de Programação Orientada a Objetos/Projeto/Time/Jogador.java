public class Jogador extends Funcionario{
    private double diretosImagem;
    private String peDominate;
    private double altura;
    private int gols;

    public Jogador(String nome, int idade, double salario, String tipo,  double bonus, double diretosImagem, String peDominante, double altura){ // Construtor
        super(nome, idade, salario, tipo, bonus);
        this.diretosImagem = diretosImagem;
        this.peDominate = peDominante;
        this.altura = altura;
        this.gols = 0;
    }

    public void setDireitosImagem(double diretosImagem){ // Método set para direitos de imagem
        this.diretosImagem = diretosImagem;
    }

    public void setPeDominate(String peDominante){ // Método set para pé dominante
        this.peDominate = peDominante;
    }

    public void setAltura(double altura){ // Método set para altura
        this.altura = altura;
    }

    public void marcar(){
        gols++;
    }

    private void calcularSalario(double salario, double bonus){ // Método para sobrescrever o calcularSalario()
        setSalario(salario + bonus + diretosImagem);
    }

    public double getDireitosImagem(){ // Método get para diretos de imagem
        return diretosImagem;
    }

    public String getPeDominante(){ // Método get para pé dominante
        return peDominate;
    }

    public double getAltura(){ // Método get para altura
        return altura;
    }

    public int getGols(){
        return gols;
    }

    public String getDados(){ // Retorna os dados, sobrescrevendo o método da classe pai
        return "Tipo de Funionário: " + getTipo() + "\nNome: " + getNome() + "\nIdade: " + getIdade() 
        + "\nSalário: R$" + getSalario() + "\nDireitos de Imagem: R$" + getDireitosImagem() + "\nPé Dominate: " + getPeDominante() + "\nAltura: " + getAltura() + "\nGols: " + getGols(); 
    }

    public String notaFiscal(){
        return "Tipo de Funcionário: " + getTipo() + "\nNome: " + getNome() + " - Salário: R$" + getSalario() + " - Direitos de Imagem: R$" + getDireitosImagem();
    }

}