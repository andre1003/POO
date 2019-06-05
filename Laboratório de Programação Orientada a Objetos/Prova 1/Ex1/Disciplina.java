public class Disciplina{
    private String disciplina;
    private int id;
    private String prof;
    private double n1;
    private double n2;

    public Disciplina(String disciplina, int id, String prof, double n1, double n2){ // Construtor da classe Disciplina
        this.disciplina = disciplina;
        this.id = id;
        this.prof = prof;
        this.n1 = n1;
        this.n2 = n2;
    }

    public double media(){ // Calcula a média
        return (n1 + n2) / 2;
    }

    public String getDisciplina(){ // Método get da disciplina
        return disciplina;
    }

    public String getProf(){ // Método get do professor
        return prof;
    }

    public double getN1(){ // Método get da nota 1
        return n1;
    }

    public double getN2(){ // Método get da nota 2
        return n2;
    }
}