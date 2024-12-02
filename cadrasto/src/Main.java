import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ola sejam bem vindo ao seu cadrasto.");

        Scanner input = new Scanner(System.in);

        System.out.print("quantos anos você tem?");
        int idade = input.nextInt();

        if(idade >= 18){
            System.out.println("você é maior de idade então vamos começa.");
            System.out.println("qual o seu nome?");
        }

    }
}