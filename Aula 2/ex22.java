import javax.swing.JOptionPane;
public class ex22{
    public static void main(String[] args) {
        
        int iNumero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        int INumero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        int INumero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));

        int iMaior = 0;

        if(iNumero1 > INumero2 && iNumero1 > INumero3){
           iMaior = iNumero1;
        }
        if(INumero2 > iNumero1 && INumero2 > INumero3){
           iMaior = INumero2;
        }
        if(INumero3 > iNumero1 && INumero3 > INumero2){
           iMaior = INumero3;
        }
        JOptionPane.showMessageDialog(null, "O Maior Número é: " + iMaior);
    }
}