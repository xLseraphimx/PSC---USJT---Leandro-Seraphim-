import javax.swing.JOptionPane;
public class ex9{
    public static void main(String[] args) {
        
        double sBase = Double.parseDouble
        (JOptionPane.showInputDialog("Digite um Número Real"));
        double sExpoente = Double.parseDouble
        (JOptionPane.showInputDialog("Digite um Expoente a Ser Elevado"));

        Double sResultado = Math.pow(sBase,sExpoente);

        JOptionPane.showMessageDialog(null,"O Primeiro Número, Elevado ao Segundo é" + " " + sResultado);
    }
}