import java.util.ArrayList;
import java.util.List;

public class Lista{
    public static void main(String args[]){
        List<String> lista = new ArrayList<>();
        lista.add("Olá mundo!");
        lista.add("Hey ya!");
        lista.add("Guedes");

        System.out.println(lista.size());
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2) + "\n");
        

        lista.remove(0);

        System.out.println(lista.size());
        System.out.println(lista.get(0));
        System.out.println(lista.get(1) + "\n");

        lista.clear();

        System.out.println(lista.size());

        List<Object> lista2 = new ArrayList<>();
        
        lista2.add("Paulo");
        lista2.add(10);
        lista2.add(1.1);
        String nome = (String) lista2.get(0);
        int i = (int) lista2.get(1);
        double f = (double) lista2.get(2);
        System.out.println("\n" + nome);
        System.out.println(i);
        System.out.println(f);
        
    }
}