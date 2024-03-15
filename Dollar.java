import java.util.Scanner;
 
public class Dollar {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // ler a catação do Dólar
        System.out.println("Qual a cotação do Dolar?");
         double cotacao =  sc.nextDouble();
        // ler a quantidade de Dólares
         System.out.println("Quantos Dólares?");
         double dolares = sc.nextDouble();
        // comverter para real
         double real = dolares * cotacao;
        // mostrar resultado
         System.out.printf("Voce tem o equivalente a R$ %.2f\n" , + real);
         sc.close();
    }
}