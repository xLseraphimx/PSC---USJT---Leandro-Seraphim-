import javax.swing.JOptionPane;
public class ex15{
    public static void main(String[] args) {
        
        String sNumero = JOptionPane.showInputDialog("Digite um Número");
        String sBase = JOptionPane.showInputDialog("Digite a Base");
        
        int iNumero = Integer.parseInt(sNumero);
        int iBase = Integer.parseInt(sBase);

        Double sLog = Math.log(iNumero) / Math.log(iBase);

        JOptionPane.showMessageDialog(null,"O Resultado do Seu Log é" + " " + sLog);
    }
}