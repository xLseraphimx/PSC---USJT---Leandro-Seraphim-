import javax.swing.JOptionPane;
public class ex12{
    public static void main(String[] args) {
        
        String sNumero = JOptionPane.showInputDialog("Digite um Número com Três Casas Decimais");
        int iNumero = Integer.parseInt(sNumero);

        int iDezena = (iNumero / 10) % 10;

        JOptionPane.showMessageDialog(null, "A Casa da Dezena é" + " " + iDezena);
    }
}