import javax.swing.JOptionPane;
public class ex10{
    public static void main(String[] args) {

        String sString1 = JOptionPane.showInputDialog("Insira uma String");
        String sString2 = JOptionPane.showInputDialog("Insira uma String");
        String sString3 = JOptionPane.showInputDialog("Insira uma String");
        
        int sComprimentoleight = sString1.length() + sString2.length() + sString3.length();

        JOptionPane.showMessageDialog(null,"A Soma do Comprimeto das Strings é" + " " + sComprimentoleight); 
    }
}