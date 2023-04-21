public class MaiorDeIdade {
    public static void main(String[] args){

        int idade = Teclado.leInt("Digite sua idade: ");
        
        if(idade >= 18)
            System.out.println("Você é maior de idade!");
        else
            System.out.println("Você é menor de idade!");    


    }
}
