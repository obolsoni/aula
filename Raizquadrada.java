import java.util.Scanner;

public class Raizquadrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        double numero = sc.nextDouble();
        System.out.println(Math.sqrt(numero));
        sc.close();
    }
}
