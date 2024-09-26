import javax.swing.JOptionPane;
public class ex14{
    public static void main(String[] args) {
        
        String sNumero = JOptionPane.showInputDialog("Digite um Número");
        Double dNumero = Double.valueOf(sNumero);

        Double dLog = Math.log10(dNumero);

        JOptionPane.showMessageDialog(null,"O Log de Base Dez do Seu Número é" + " " + dLog);
    }
}