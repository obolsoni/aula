import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Qual o valor do ingresso?");
        Double valorIngresso = leitor.nextDouble();
        System.out.println("Digite a sua idade:");
        int idade = leitor.nextInt();

        if (idade < 2) {
            System.out.println("Ingresso Gratuito");
        } else if (idade < 18) {
            System.out.println("O valor do Ingresso é:" + valorIngresso/2 );
        } else if (idade >= 65) {
            System.out.println("O valor do ingresso é:" + valorIngresso/2 );
        } else if (idade >= 18) {
            System.out.println("O valor do ingresso é:" + valorIngresso );
        
        }
        leitor.close();
    }
}
