public class Soma{
    private int n1;
    private int n2;
    private int n3;

    public Soma(int n1, int n2, int n3){ // Construtor da classe Soma
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int somar(){ // Método que retorna a soma de 3 elementos
        return (n1 + n2 + n3);
    }
}