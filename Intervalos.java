import javax.swing.JOptionPane;

public class Intervalos {
    public static void main(String[] args) {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));

        if (n<0 || n>10) {
            System.out.println("invalido");
        }
        
        else if (n<2) {
            System.out.println("intervalo 1");
        }

        else if (n<5) {
            System.out.println("intervalo 2");
        }

        else if (n<9) {
            System.out.println("intervalo 3");
        }

        else {
            System.out.println("intervalo 4");
        }
    }
}
