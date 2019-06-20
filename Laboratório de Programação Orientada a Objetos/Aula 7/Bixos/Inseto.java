import javax.swing.JOptionPane;

public class Inseto extends Animal{
    private boolean pica;
    private boolean venenoso;
    private int veneno;

    public Inseto(String nome, boolean vivo, boolean extincao, boolean pica, boolean venenoso, int veneno){
        super(nome, vivo, extincao);
        this.pica = pica;
        this.venenoso = venenoso;
        if(venenoso == true){
            if(veneno >= 0 && veneno <= 10)
                this.veneno = veneno;
            else if(veneno < 0)
                this.veneno = 0;
            else 
                this.veneno = 10;
        }
        else
            this.veneno = 0;
        
    }

    public void setPica(boolean pica){
        this.pica = pica;
    }

    public void setVenenoso(boolean venenoso){
        this.venenoso = venenoso;
    }

    public void setVeneno(int veneno){
        if(veneno < 0)
            this.veneno = 0;
        else if(veneno > 10)
            this.veneno = 10;
        else
            this.veneno = veneno;
    }

    public String getPica(){
        if(pica == true)
            return "Pica";
        else
            return "Não pica";
    }

    public String getVenenoso(){
        if(venenoso == true)
            return "Sim";
        else
            return "Não";
    }

    public String getVeneno(){
        if(venenoso == true){
            if(veneno < 3)
                return "Pouco venenoso";
            else if(veneno < 7)
                return "Venenoso";
            else
                return "Muito venenoso";
        }
        else
            return "Não possui veneno";
    }

    public String locomover(){
        return "Voar voar, subir subir...";
    }

    public void getDados(){
        JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\nVivo: " + getVivo() + "\nExtinto: " + getExtincao() + "\nPica: " + getPica() + "\nVenenoso: " + getVenenoso()
        + "\nVeneno: " + getVeneno() + "\nModo de locomoção: " + locomover(), "Dados", JOptionPane.INFORMATION_MESSAGE);
    }
}