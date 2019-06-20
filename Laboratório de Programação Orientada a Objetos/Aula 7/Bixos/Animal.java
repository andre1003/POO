import javax.swing.JOptionPane;

public class Animal{
    private String nome;
    private boolean vivo;
    private boolean extincao;

    public Animal(String nome, boolean vivo, boolean extincao){
        this.nome = nome;
        this.vivo = vivo;
        this.extincao = extincao;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setVivo(boolean vivo){
        this.vivo = vivo;
    }

    public void setExtincao(boolean extincao){
        this.extincao = extincao;
    }

    public String getNome(){
        return nome;
    }

    public String getVivo(){
        if(vivo == true)
            return "Sim";
        else
            return "Não";
    }

    public String getExtincao(){
        if(extincao == true)
            return "Extinto";
        else
            return "Não está extinto";
    }

    public String locomover(){
        return "Pé direito... Pé esquerdo... Pé direito... Pé esquerdo";
    }

    public void getDados(){
        JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\nVivo: " + getVivo() + "\nExtinção: " + getExtincao(), "Dados", JOptionPane.INFORMATION_MESSAGE);
    }
}