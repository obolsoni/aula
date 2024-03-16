
import javax.swing.JOptionPane;

public class Dirigir {
    public static void main(String[] args) {
        String Idade = JOptionPane.showInputDialog("Diga sua idade:");
        int numero = Integer.parseInt(Idade);
        if (numero>=18)
        {
            JOptionPane.showMessageDialog(null, "Maior de idade, pode dirigir");
        }
        else {
            JOptionPane.showMessageDialog(null, "Menor de idade, não pode dirigir");
        }
    }
}
