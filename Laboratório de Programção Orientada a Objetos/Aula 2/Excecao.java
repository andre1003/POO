import javax.swing.JOptionPane;
import java.util.*;

public class Excecao{
    public static void main(String args[]){
        Scanner d = new Scanner(System.in);
        System.out.print("Qual o tamanho do vetor: ");
        int n = 0;
        n = d.nextInt(); // Tamanho do vetor
        try{
            double[] v = new double[n]; // Cria o vetor, se n for negativo cai no primeiro catch
            for(int i = 0; i < n; i++){
                System.out.print("Insira um número: ");
                v[i] = d.nextInt(); // Insere valores no vetor
            }
            System.out.print("\nInsira um número para dividir todo o vetor: ");
            int num;
            num = d.nextInt(); // Número para dividir todos os valores do vetor
            if(num == 0) // Se num for negativo cai no segundo catch
                throw new ArithmeticException("/ by 0"); // É preciso lançar uma nova ArithmeticException, uma vez que em double, uma / por 0 = infinito
            for(int i = 0; i < n; i++){
                v[i] /= num; // Divide todos os números do vetor
                System.out.println(v[i]); // Mostra os números já dividos
            }      
        }
        catch(NegativeArraySizeException e){ // Caso o índice do vetor seja negativo
            System.out.println("Índice negativo!");
        }
        catch(InputMismatchException e){ // Caso seja inserido um caracter ao invéz de um número
            System.out.println("Insira somente números!");
        }
        catch(ArithmeticException e){ // Caso o denominador seja 0
            System.out.println("Divisão por 0!");
        }
    }
}