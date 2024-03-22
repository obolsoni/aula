import javax.swing.JOptionPane;

public class MaisdeDois {
    public static void main(String[] args) {
        Double numero1 = 
        Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero:"));
        Double numero2 =
        Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero:"));
        if (numero1 >= numero2){
            JOptionPane.showMessageDialog(null, numero1 + " é maior");
        } else {
            JOptionPane.showMessageDialog(null, numero2 + " é maior");
        }
    }
}
