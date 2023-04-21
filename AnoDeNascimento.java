public class AnoDeNascimento {
    public static void main(String [] args){
        int anoAtual = 2023;
        int anoDeNascimento = Teclado.leInt("Escreva o ano de seu nascimento: ");
        int idade = anoAtual - anoDeNascimento;

        System.out.println("Sua idade atual é: " + idade + " anos");

        if (idade >= 65)
            System.out.println("Você já pode se aposentar!");
        
    }
    
}
