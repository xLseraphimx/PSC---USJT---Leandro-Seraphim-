import javax.swing.JOptionPane;
public class ex20{
    public static void main(String[] args) {
        double sRaio =  Double.parseDouble(JOptionPane.showInputDialog("Digite aqui o Raio do Círculo"));
        double sPi = 3.14159;

        double sArea = sPi * sRaio * sRaio;

        JOptionPane.showMessageDialog(null,"A Área do Círculo é" + " " + sArea + " " + "metros");

    }
}