import javax.swing.JOptionPane;
public class ex19{
    public static void main(String[] args) {
        
        int iNumero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));
        int INumero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));

        if(iNumero1 > INumero2)
        JOptionPane.showMessageDialog(null, "A Ordem Decrescente Dos Números é " + iNumero1 + " ; " + INumero2);

        else{
        JOptionPane.showMessageDialog(null, "A Ordem Decrescente Dos Números é " + INumero2 + " ; " + iNumero1);
        }
    }
}
    