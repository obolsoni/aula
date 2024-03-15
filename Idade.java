import javax.swing.JOptionPane;

    public class Idade {
        public static void main(String[] args) {
            int anos = Integer.parseInt(JOptionPane.showInputDialog("Digite idade em anos"));
            int meses = Integer.parseInt(JOptionPane.showInputDialog("Digite idade em meses"));
            int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite idade em dias"));
            int emDias = anos * 365 * meses * 30 + dias;
            JOptionPane.showMessageDialog(null, "Suas idade em dias" + emDias);
    }
}
