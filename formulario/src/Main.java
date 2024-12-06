import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("sejam bem vindo ao formulário de educação fisica");

        System.out.print("quantos anos você tem? ");
        byte idade = input.nextByte();

        while (true){
            if (idade >= 18){

                System.out.print("qual o seu nome? ");
                String nome = input.next();

                System.out.print("qual a sua altura? ");
                float altura = input.nextFloat();

                System.out.print("qual o seu peso? ");
                float peso = input.nextFloat();

                System.out.print("quantas vezes por semanas que faz exercicos? ");
                byte dia = input.nextByte();

                switch (dia){
                    case 0:
                        System.out.println("Nossa você poderia fazer pelo menos um!");
                        break;
                    case 1:
                        System.out.println("isso é bom mas você poderia faz mais exercicos na semana!");
                        break;
                    case 2:
                        System.out.println("gostei de ver mas você poderia fazer mais exercicios!");
                        break;
                    case 3:
                        System.out.println("você esta de parabéns por fazer 3 exercicios!");
                        break;
                    default:
                        System.out.println("muito legal continue assim!");
                        break;
                }

                float imc = peso/(altura * altura);

                System.out.println("olhar "+nome+" o seu imc é "+imc);

            }else {
                System.out.println("você precisa de uma autorização de um reponsavel");

            }
            break;

        }
    }
}