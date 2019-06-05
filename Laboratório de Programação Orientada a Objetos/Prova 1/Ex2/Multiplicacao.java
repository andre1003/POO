public class Multiplicacao{
    private int n1;
    private int n2;
    private int n3;

    public Multiplicacao(int n1, int n2, int n3){ // Construtor da classe Multiplicacao
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int multiplicar(){ // Método que retorna a multiplicação de 3 elementos
        return (n1 * n2 * n3);
    }
}