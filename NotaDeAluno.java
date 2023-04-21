public class NotaDeAluno {
    public static void main(String[] args) {
        int nota = Teclado.leInt("Digite sua nota: ");

        if (nota >= 90)
            System.out.println("Sua nota é A");
        
        else if (nota >= 80 && nota <= 80)
            System.out.println("Sua nota é B");
        
        else if (nota >= 70 && nota <= 79)
            System.out.println("Sua nota é de C");
        
        else if (nota >= 60 && nota <= 69)
            System.out.println("Sua nota é D");
        
        else 
            System.out.println("Sua nota é F");    
        
    }
    
}
