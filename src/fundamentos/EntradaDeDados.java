import java.util.Scanner;

public class EntradaDeDados {
    
   public static void main(String[] args) {
    
     Scanner scan = new Scanner(System.in);

    System.out.println("Qual é o seu nome?");
    String nome = scan.nextLine();

    System.out.println("Qual é a sua idade?");
    int idade = scan.nextInt();
    
    scan.close();

    System.out.println("Olá, " + nome + " você tem " + idade + " anos.");

   }
}
