public class DoisNumerosInteiros{
    public static void main(String[] args){
        int num1 = Teclado.leInt("Digite o 1ª numero: ");
        int num2 = Teclado.leInt("Digite o 2ª número: ");

        if(num1 > num2)
            System.out.println("O numero " + num1 + " é maior que o número " + num2);
        else
            System.out.println("O numero " + num2 + " é maior que o número " + num1);


    }
}