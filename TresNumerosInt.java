public class TresNumerosInt{
    public static void main(String[] args){
       int num1 = Teclado.leInt("Digite o 1ª numero");
       int num2 = Teclado.leInt("Digite o 2ª numero");
       int num3 = Teclado.leInt("Digite o 3ª numero");
       
       if (num1 > num2 && num1 > num3)
            System.out.println("O número " + num1 + " é o maior");
        else if(num2 > num1 && num2 > num3)
            System.out.println("O número " + num2 + " é o maior");     
        else    
           System.out.println("O número " + num3 + " é o maior");  

        }
    }
           