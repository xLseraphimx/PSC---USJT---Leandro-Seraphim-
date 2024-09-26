import javax.swing.JOptionPane;
public class ex23{
    public static void main(String[] args) {

        double sBase = Double.parseDouble(JOptionPane.showInputDialog("Digite a Base do Triangulo"));
        double sAltura = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do Triangulo"));

        double sArea = sBase * sAltura/2;

        JOptionPane.showMessageDialog(null, "A Área do Triangulo é" + " " + sArea);
    }
}