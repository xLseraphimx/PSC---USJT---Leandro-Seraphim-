
import javax.swing.JOptionPane;

public class ex21{
    public static void main(String[] args) {
        
        int iNumero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Número"));
        int iNumero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Número"));
        int iNumero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Terceiro Número"));

        int iMaiorNumero = iNumero1;

        // iMaiorNúmero passa a ser o Segundo Número
        if(iNumero2 > iMaiorNumero){
           iMaiorNumero = iNumero2; 
        }
        if(iNumero3 > iMaiorNumero){
           iMaiorNumero = iNumero3;
        }
        JOptionPane.showMessageDialog(null, "O Maior Número é: " + iMaiorNumero);
    }
}

