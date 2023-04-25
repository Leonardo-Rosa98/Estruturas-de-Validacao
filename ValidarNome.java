import java.util.Scanner;

public class ValidarNome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean acesso = false;

        while (acesso == false) {
            System.out.print("Digite seu nome: ");
            String nome = input.nextLine();
            if (nome.equals("Leonardo") || nome.equals("leo")) {
                System.out.println("Acesso permitido");
                acesso = true;
            }else {
                System.out.println("Acesso negado!");
            }
        }   

    }
}
