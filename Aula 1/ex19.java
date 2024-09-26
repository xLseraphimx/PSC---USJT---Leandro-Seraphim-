import javax.swing.JOptionPane;
public class ex19{
    public static void main(String[] args) {

    int sNumeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    int sNumeroB = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    int sNumeroC = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

    int sCalculo = sNumeroA + sNumeroB + sNumeroC;

    int sExpressao = 2 * ((sNumeroA - sNumeroC)/8) - sNumeroB * 5;

    JOptionPane.showMessageDialog(null, "A soma dos três números é" + " " + sCalculo + " " + 
    "E o resultado da Expressão é" + " " + sExpressao);
    }
}