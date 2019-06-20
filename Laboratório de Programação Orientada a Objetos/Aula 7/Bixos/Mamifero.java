import javax.swing.JOptionPane;

public class Mamifero extends Animal{
    private boolean fome;
    private int nvl_raiva;

    public Mamifero(String nome, boolean vivo, boolean extincao, boolean fome, int nvl_raiva){
        super(nome, vivo, extincao);
        this.fome = fome;
        setRaiva(nvl_raiva);
    }

    public void setFome(boolean fome){
        this.fome = fome;
    }

    public void setRaiva(int nvl_raiva){
        if(nvl_raiva < 0)
            this.nvl_raiva = 0;
        else if(nvl_raiva > 10)
            this.nvl_raiva = 10;
        else
            this.nvl_raiva = nvl_raiva;
    }

    public String getFome(){
        if(fome == true)
            return "Está com fome";
        else
            return "Está cheio";
    }

    public String getRaiva(){
        if(nvl_raiva < 3)
            return "Pacífico";
        else if(nvl_raiva < 7)
            return "Ficando puto";
        else
            return "Pistolado";
    }

    public void getDados(){
        JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\nVivo: " + getVivo() + "\nExtinto: " + getExtincao() + "\nFome: " + getFome()
        + "\nRaiva: " + getRaiva() + "\nModo de locomoção: " + locomover(), "Dados", JOptionPane.INFORMATION_MESSAGE);
    }
}