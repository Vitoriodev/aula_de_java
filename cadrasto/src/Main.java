import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ola sejam bem-vindo ao seu cadastro.");

        Scanner input = new Scanner(System.in);

        System.out.print("quantos anos você tem? ");
        int idade = input.nextInt();

        if(idade >= 18) {
            System.out.println("você é maior de idade então vamos começar.");

            System.out.print("qual o seu nome? ");
            String nome = input.next();

            System.out.print("qual o seu sexo? (F) (M): ");
            String sexo = input.next();

            String sexoDefinido;
            if(sexo.equals("M") || sexo.equals("m")){
                sexoDefinido = "Macho";
            }else {
                sexoDefinido = "Fêmea";
            }

            System.out.print("Você tem filhos? (S) (N) ");
            String filho = input.next();

            int filhos;
            if (filho.equals("S") || filho.equals("s")) {
                System.out.print("quantos filhos você tem? ");
                filhos = input.nextInt();


            } else {
                filhos = 0;
            }

            System.out.print("qual foi o país que você nasceu? ");
            String pais = input.next();

            System.out.println();

            //Resultado.
            System.out.println("Muito bem, você terminou o seu cadrasto vamos ver como ficou.");
            System.out.println("O seu nome é "+nome+" e tem "+idade+" anos.");
            System.out.println("Seu sexo é: "+sexoDefinido+" e você nasceu em "+pais);
            System.out.println("Você possui "+filhos+" filhos");
        } else {
            System.out.println("Você não tem idade suficiênte");
        }

    }
}