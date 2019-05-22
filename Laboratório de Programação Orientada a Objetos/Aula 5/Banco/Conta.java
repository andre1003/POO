import java.util.Random;

public class Conta{
    private String num_conta; // Número da conta (String para poder ser gerado de forma aleatória)
    private int num_agencia; // Número da agência (String para poder ser gerado de forma aleatória)
    private double saldo; // Valor do saldo atual

    private String GerarNumero(){ // Método para gerar o valor do número da conta aleatóriamente
        int num;
        String num_gerado = "";
        Random random = new Random();

        for(int i = 0; i < 4; i++){ // Gera 4 valores
            num = random.nextInt(9);
            num_gerado += Integer.toString(num);
        }

        return num_gerado; // Retorna o número da conta
    }

    public void CriarConta(int num_agencia){ // Método para criar a conta
        setNumConta(GerarNumero());
        setNumAgencia(num_agencia);
        setSaldo(0);
    }

    private void setNumConta(String num_conta){ // É private para que somente o programa possa inserir o número da conta
        this.num_conta = num_conta;
    }

    private void setNumAgencia(int num_agencia){ // É private pois só pode ser alterado na hora de criar uma nova conta
        this.num_agencia = num_agencia;
    }

    public void setSaldo(double saldo){ // Inserir o saldo
        if(saldo < 0.0) // Validação para que o saldo inserido não seja negativo
            this.saldo = 0.0;
        else
            this.saldo = saldo;
    }

    public String getNumConta(){ // Retorna o número da conta
        return num_conta;
    }

    public int getNumAgencia(){ // Retorna o número da agência
        return num_agencia;
    }

    public double getSaldo(){ // Retorna o saldo atual
        return saldo;
    }
}