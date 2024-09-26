import javax.swing.JOptionPane;
public class ex13{
    public static void main(String[] args) {

        String sAngulo = JOptionPane.showInputDialog("Insira o Angulo em Graus");

        double dGrau = Double.parseDouble(sAngulo);
        double dRadiano = Math.toRadians(dGrau);

        Double dSeno = Math.sin(dRadiano);
        Double dCosseno = Math.cos(dRadiano);
        Double dTangente = Math.tan(dRadiano);

        Double dSecante = 1 / dCosseno;
        Double dCossecante = 1 / dSeno;
        Double dCotangente = 1 / dTangente;

        JOptionPane.showMessageDialog(null, "O Seno é " + dSeno + "\nO Cosseno: " + dCosseno + "\nA Tangente é: " + "\nO Secante é: " + 
        dSecante + "\nO Cossecante é " + dCossecante + "\nO Cotangente é: " + dCotangente);
    }
}