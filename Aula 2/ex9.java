import javax.swing.JOptionPane;

public class ex9{
    public static void main(String[] args) {
        
        int iNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));

        if(iNumero % 3 == 0)
        JOptionPane.showMessageDialog(null,"O Número É Multiplo de Três: " + iNumero);

        else{
            JOptionPane.showMessageDialog(null, "O Número não é Multiplo de Três: " + " " + iNumero);
        }
    }
}