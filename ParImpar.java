import javax.swing.JOptionPane;

public class ParImpar {
public static void main(String[] args) {
    String auxiliar = JOptionPane.showInputDialog("Digite um numero interio");
    int numero = Integer.parseInt(auxiliar);
    int resto = numero % 2;
    if (resto == 0) {
        JOptionPane.showMessageDialog(null, numero + " é par");
    }
    else {
        JOptionPane.showMessageDialog(null, numero + "é impar");
    }

    }
}