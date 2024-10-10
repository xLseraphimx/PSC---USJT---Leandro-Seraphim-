import javax.swing.JOptionPane;
public class ex24{
    public static void main(String[] args) {
        
        int iNumero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));
        int iNumero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));
        int iNumero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));
        int iNumero4 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));
        int iNumero5 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));

        int iMaiorNumero = iNumero1;
        int iMenorNumero = iNumero1;

        if(iNumero2 > iMaiorNumero){
           iMaiorNumero = iNumero2;
        }
        if(iNumero3 > iMaiorNumero){
           iMaiorNumero = iNumero3;
        }
        if(iNumero4 > iMaiorNumero){
           iMaiorNumero = iNumero4;
        }
        if(iNumero5 > iMaiorNumero){
           iMaiorNumero = iNumero5;
        }

        if(iNumero2 < iMenorNumero){
           iMenorNumero = iNumero2;
        }
        if(iNumero3 < iMenorNumero){
           iMenorNumero = iNumero3;
        }
        if(iNumero4 < iMenorNumero){
           iMenorNumero = iNumero4;
        }
        if(iNumero5 < iMenorNumero){
           iMenorNumero = iNumero5;
        }
        JOptionPane.showMessageDialog(null, "O Maior Número é: " + iMaiorNumero + "\nO Menor Número é: " + iMenorNumero);
    }
}