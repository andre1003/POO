import java.util.*;

public class Ex2{
    public static void main(String args[]){
        Scanner d = new Scanner(System.in);
        int n1 = 0, n2 = 0, op;
        System.out.print("Insira um número: ");
        try{
            n1 = d.nextInt();
        }
        catch(Exception e){
            System.out.println("Digite somente números");
        }
        System.out.print("Insira um número: ");
        try{
            n2 = d.nextInt();
        }
        catch(NumberFormatException e){
            System.out.println("Digite somente números");
        };
        System.out.print("1 - Primeiro elevado pelo segundo\n2 - Raíz quadrada de cada número\n3 - Raíz cúbica de cada número\nSua escolha: ");
        op = d.nextInt();
        switch(op){
            case 1:
                double r;
                r =  Math.pow(n1, n2);
                System.out.println(n1 + "^" + n2 + " = " + r);
                break;
            case 2:
                double r1 = Math.sqrt(n1);
                double r2 = Math.sqrt(n2);
                System.out.println("Raiz quadrada de " + n1 + " = " + r1);
                System.out.println("Raiz quadrada de " + n2 + " = " + r2);
                break;
            case 3:
                double r3 = Math.cbrt(n1);
                double r4 = Math.cbrt(n2);
                System.out.println("Raiz cúbica de " + n1 + " = " + r3);
                System.out.println("Raiz cúbica de " + n2 + " = " + r4);
                break;
            default:
                System.out.println("Não existe essa opção!");
        }
    }
}