public class Subtracao{
    private int n1;
    private int n2;
    private int n3;

    public Subtracao(int n1, int n2, int n3){ // Construtor da classe Substracao
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int subtrair(){ // Método que retorna a subtração de 3 elementos
        return (n1 - n2 - n3);
    }
}