
public class HorasTrabalhadas {
    public static void main(String [] args) {
        int HorasTrabalhadas = Teclado.leInt("Digite suas horas trabalhadas: ");
        double valorHoraTrabalhada = Teclado.leDouble("Digite o valor de sua hora.");
        double salarioTotal = HorasTrabalhadas * valorHoraTrabalhada;
        
        double AdicionalValorHoraTrabalhada = valorHoraTrabalhada * 1.50;
        double salarioTotalComAcional = HorasTrabalhadas * AdicionalValorHoraTrabalhada;

        if (HorasTrabalhadas > 40){
            System.out.println("Seu salario: " + salarioTotal);
            System.out.println("Seu salario com adicional: " + salarioTotalComAcional);
        }else    
             System.out.println("Seu salario: " + salarioTotal);
    }
}
