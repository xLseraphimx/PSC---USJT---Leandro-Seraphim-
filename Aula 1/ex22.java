import javax.swing.JOptionPane;
public class ex22{
    public static void main(String[] args) {
        int sNumero = Integer.parseInt
        (JOptionPane.showInputDialog("Digite um Numero"));
        int sExpoente = Integer.parseInt
        (JOptionPane.showInputDialog("Digite um expoente"));

        double sRaiz = Math.sqrt(sNumero);
        double sQuadrado = Math.pow(sNumero,sExpoente);

        JOptionPane.showMessageDialog(null,"A Raiz Quadrada do seu Numero é" + " " + sRaiz + "O quadrado do Seu número é" + " " + sQuadrado);
    }
}