import java.util.Scanner;

public class apredendo2 {
    public static void main(String[] args){

        /* System.out.println("Tipos primitivos casting");

        //isso é um casting, estou forçando um valor muito grande em uma variavel pequena
        int oi = (int) 1000L;

        String como = "pode colocar um grande texto";

        System.out.println(como);*/

        String nome = "Vitorio";
        String endereco = "imperial";
        String salario = "1500";
        String data = "30/11";

        System.out.print("Eu " +nome+" morando no endereço "+endereco);
        System.out.println(", confirmo que o salário de "+salario+" reais na data "+data);

        // isso é um input, para receber uma informação do usuario.
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        System.out.println(numero);

        System.out.println("hdfjbhskl");


    }
}
