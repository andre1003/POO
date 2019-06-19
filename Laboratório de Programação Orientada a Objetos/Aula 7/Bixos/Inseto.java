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
            else
                this.veneno = 0;
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

    public void setVeneno()
}