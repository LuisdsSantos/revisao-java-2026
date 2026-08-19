package fundamentos;

public class Concatenacao {
    public static void main(String[] args) {
        
        String nome = "Luis";
        int idade = 30;

        //Concatenacao

        System.out.println("Olá " + nome + " voce tem " + idade + " anos");

        System.out.println(String.format(" Olá %s voce tem %s anos.", nome, idade));
    }
}
