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

            String sexoDefinido;
            String sexo;
            while (true){
                System.out.print("qual o seu sexo? (F) (M): ");
                sexo = input.next();

                if(sexo.equals("M") || sexo.equals("m")){
                    sexoDefinido = "Macho";
                    break;
                }else if((sexo.equals("F") || sexo.equals("f"))) {
                    sexoDefinido = "Fêmea";
                    break;
                }else {
                    System.out.println("ops algo deu errado tente novamente.");
                }
            }

            int filhos;
            String filho;
            while (true){
                System.out.print("Você tem filhos? (S) (N) ");
                filho = input.next();

                if (filho.equals("S") || filho.equals("s")){
                    System.out.print("quantos filhos você tem? ");
                    filhos = input.nextInt();
                    break;

                }else if (filho.equals("N") || filho.equals("n")){
                    filhos = 0;
                    break;

                }else {
                    System.out.println("ops algo deu errado tente novamente.");
                }

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