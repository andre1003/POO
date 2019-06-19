import javax.lang.model.util.ElementScanner6;

public class Mamifero extends Animal{
    private boolean fome;
    private int nvl_raiva;

    public Mamifero(String nome, boolean vivo, boolean extincao, boolean fome, int nvl_raiva){
        super(nome, vivo, extincao);
        this.fome = fome;
        this.nvl_raiva = nvl_raiva;
    }

    public void setFome(boolean fome){
        this.fome = fome;
    }

    public void setRaiva(int nvl_raiva){
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
}