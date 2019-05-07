import java.util.Scanner;

public class Carrinho{
    public static void main(String args[]){
        Scanner d = new Scanner(System.in);
        String[] id = new String[4];
        String[] description = new String[4];
        int[] quantity = new int[4];
        double[] unity_price = new double[4];
        double total = 0.0;

        for(int i = 0; i < 4; i++){
            System.out.print("ID: ");
            id[i] = d.nextLine();
            d = new Scanner(System.in);
            System.out.print("Descricao: ");
            description[i] = d.nextLine();
            d = new Scanner(System.in);
            System.out.print("Quantidade: ");
            quantity[i] = d.nextInt();
            System.out.print("Preco: ");
            unity_price[i] = d.nextDouble();
            d = new Scanner(System.in);
            System.out.println();
        }

        Item item1 = new Item(id[0], description[0], quantity[0], unity_price[0]);
        Item item2 = new Item(id[1], description[1], quantity[1], unity_price[1]);
        Item item3 = new Item(id[2], description[2], quantity[2], unity_price[2]);
        Item item4 = new Item(id[3], description[3], quantity[3], unity_price[3]);

        total += item1.getAdjustedTotal();
        total += item2.getAdjustedTotal();
        total += item3.getAdjustedTotal();
        total += item4.getAdjustedTotal();

        item3.setDiscount(0.15);
        System.out.println("Descricao: " + item1.getDescription() + " - Quantidade: " + item1.getQuantity() + "  - Preco: " + item1.getPrice());
        System.out.println("Descricao: " + item2.getDescription() + " - Quantidade: " + item2.getQuantity() + "  - Preco: " + item2.getPrice());
        System.out.println("Descricao: " + item3.getDescription() + " - Quantidade: " + item3.getQuantity() + "  - Preco: " + item3.getPriceWithDiscount());
        System.out.println("Descricao: " + item4.getDescription() + " - Quantidade: " + item4.getQuantity() + "  - Preco: " + item4.getPrice());
        System.out.println("Total: " + total);
    }
}