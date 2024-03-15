import java.util.Scanner;
 
public class Comissao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o preça da peça: ");
        double precoUnitario = sc.nextDouble();
        System.out.println("Digite a quantidade vendida: ");
        double quantidade = sc.nextDouble();
        double total = precoUnitario * quantidade;
        double Comissao = 5/100d;
        double valorComissao = total * Comissao;
        System.out.println("Sua comissao é de: " + valorComissao);
        sc.close();
    }
   
}