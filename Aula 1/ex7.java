import javax.swing.JOptionPane;
public class ex7{
    public static void main(String[] args) {
        int sIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        int Idade = sIdade * 365;

        JOptionPane.showMessageDialog(null, "Sua idade em dias, é aproximadamente" + " " + Idade);
    }
}