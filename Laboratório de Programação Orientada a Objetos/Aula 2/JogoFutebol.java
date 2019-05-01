import java.util.Scanner;

public class JogoFutebol{
    public static void main(String args[]){
		Scanner t = new Scanner(System.in);
		System.out.println("Quanto o time A marcou? ");
		int a = t.nextInt();
		System.out.println("Quanto o time B marcou?");
		int b = t.nextInt();
		if(a > b){
			System.out.println("O time A venceu");
		}
		else if(b > a){
			System.out.println("O time B venceu");
		}
		else{
			System.out.println("Deu empate");
		}
	}
}