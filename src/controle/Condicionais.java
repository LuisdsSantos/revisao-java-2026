public interface Condicionais {
    
    public static void main(String[] args) {
        
        double nota = 8;

        if(nota >= 7){
            System.out.println("Aprovado");
        }else if(nota >= 5){
            System.out.println("Recuperacao");
        }else{
            System.out.println("Reprovado");
        }

    }
}
