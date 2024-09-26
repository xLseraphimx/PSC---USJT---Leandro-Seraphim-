import javax.swing.JOptionPane;
public class ex6{
    public static void main(String[] args) {
        
        String sMilhar = JOptionPane.showInputDialog("Digite uma Unidade de Milhar");
        String sCentena = JOptionPane.showInputDialog("Digite uma Centena");
        String sDezena = JOptionPane.showInputDialog("Digite uma Dezena");
        String sUnidade = JOptionPane.showInputDialog("Digite uma Unidade");

        char Milhar = sMilhar.charAt(0);
        char Centena = sCentena.charAt(0);
        char Dezena = sDezena.charAt(0);
        char Unidade = sUnidade.charAt(0);

        JOptionPane.showMessageDialog(null, "O numero tem como unidade de milhar: " + Milhar + " \ncentena: " + 
        Centena + " \ndezena: " + Dezena + " \nunidade: " + Unidade + " " + "\ne o numero é: " + " " + Milhar + Centena + Dezena + Unidade);
     }
}