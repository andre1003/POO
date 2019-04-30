import java.util.Scanner;

public class Tabuada{
    public static void main(String args[]){
        Scanner dado = new Scanner(System.in);
        int maior, menor;
        System.out.print("Insira um numero: ");
        maior = dado.nextInt(); // só irá fazer uma comparação
        System.out.print("Insira outro numero: ");
        menor = dado.nextInt();
        if(menor > maior) // a variável maior vai receber o maior número entre os dois
            maior = menor;
        
        for(int i = 1; i <= 10; i++){
            System.out.println(maior + " x " + i + " = " + maior * i); // faz a tabuada
        }
    }
}