import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculoImc {
    public static void main(String [] args) { 
        double altura = Teclado.leDouble("Digite dua altura: ");
        double peso = Teclado.leDouble("Digite seu peso: ");
        double imc = peso / (altura * altura);
        BigDecimal imcArredondado = new BigDecimal(imc).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Seu imc é de: " + imcArredondado);
     
    
        if(imcArredondado.doubleValue() >= 40.00)
            System.out.println("Você está com obesidade grau 3.");
        else if(imcArredondado.doubleValue() >= 35.00 && imcArredondado.doubleValue() <=39.99)
            System.out.println("Você está com obesidade grau 2.");    
        else if(imcArredondado.doubleValue() >= 30.00 && imcArredondado.doubleValue() <=34.99)
            System.out.println("Você está com obesidade grau 1.");
        else if(imcArredondado.doubleValue() >= 25.00 && imcArredondado.doubleValue() <=29.99)
            System.out.println("Você está com sobrepeso.");
        else if(imcArredondado.doubleValue() >= 18.50 && imcArredondado.doubleValue() <=24.99)
            System.out.println("Você está com peso normal.");
        else if(imcArredondado.doubleValue() < 18.50)
            System.out.println("Você está baixo do peso.");               

    }
}
