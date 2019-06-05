public class Divisao{
    private int n1;
    private int n2;
    private int n3;

    public Divisao(int n1, int n2, int n3){ // Construtor da classe Divisao
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double dividir(){ // Método que retorna a divisão de 3 elementos, convertendo-os para double (pode ter um resultado quebrado)
        double N1 = (double) n1;
        double N2 = (double) n2;
        double N3 = (double) n3;
        double aux = N1 / N2;
        return aux / N3;
    } 
}