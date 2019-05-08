import javax.swing.JOptionPane;
import java.util.*;

public class Excecao{
    public static void main(String args[]){
        Scanner d = new Scanner(System.in);

        try{
            int n = 0;
            System.out.print("Qual o tamanho do vetor: ");
            n = d.nextInt(); // Tamanho do vetor
            int[] v = new int[n]; // Cria o vetor, se n for negativo cai no primeiro catch

            for(int i = 0; i < n; i++){
                System.out.print("Insira um numero: ");
                v[i] = d.nextInt(); // Insere valores no vetor
            }

            System.out.print("\n1 - Dividir todo o vetor por um numero\n2 - Raiz quadrada de cada elemento do vetor\nSua opcao: ");
            int op = d.nextInt();

            switch(op){
                case 1:
                    System.out.print("\nInsira um numero para dividir todo o vetor: ");
                    int num;
                    num = d.nextInt(); // Número para dividir todos os valores do vetor
                    if(num == 0) // Se num for negativo cai no segundo catch
                        throw new ArithmeticException("\n/ by 0"); // É preciso lançar uma nova ArithmeticException, uma vez que em double, uma / por 0 = infinito
                    for(int i = 0; i < n; i++){
                        System.out.println(v[i] + "/" + num + " = " + (double) v[i] / num); // Mostra os números do vetor dividos
                    }
                    break;

                case 2:
                    for(int i = 0; i < n; i++){
                        if(v[i] < 0)
                            throw new ArithmeticException("\nRaiz quadrada de numero negativo!");
                        System.out.println("Raiz quadrada de " + v[i] + ": " +Math.sqrt(v[i])); // Mostra a raíz quadrada
                    }
                    break;
                default:
                    System.out.println("\nOpcao invalida!");             
            }      
        }
        
        catch(NegativeArraySizeException e){ // Caso o índice do vetor seja negativo
            System.out.println("Indice negativo!");
        }
        
        catch(InputMismatchException e){ // Caso seja inserido um caracter ao invéz de um número
            System.out.println("Insira somente números!");
        }
        
        catch(ArithmeticException e){ // Caso o denominador seja 0
            System.out.println(e.getMessage());
        }
    }
}