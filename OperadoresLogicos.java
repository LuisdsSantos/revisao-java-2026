public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
        String formaPagamento = "a vista";
        double valor = 200;        

        System.out.println(formaPagamento == "a vista" && valor >= 100);
        System.out.println(formaPagamento == "a prazo" || valor >= 100);

          boolean a = true;

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de !a: " + !a);

        int a1 = 5;  // Representação binária: 0101
        int b = 3;  // Representação binária: 0011

        int resultado = a1 | b; // 0101 | 0011 = 0111 (7 em decimal)

        System.out.println("Resultado de a | b: " + resultado);


        int resultado1 = a1 & b; // 0101 & 0011 = 0001 (1 em decimal)

        System.out.println("Resultado de a & b: " + resultado1);
    }
}
