public class ParOuImpar {
    public static void main(String[] args){
        int numero = Teclado.leInt("Por favor, digite um número: ");
        if(numero % 2 == 0)
            System.out.println("O número " + numero + " é par!");
        else
            System.out.println("O número: " + numero + " é impar");    
    }
   
}
