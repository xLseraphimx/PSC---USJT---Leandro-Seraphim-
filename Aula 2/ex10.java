import javax.swing.JOptionPane;

public class ex10{
    public static void main(String[] args) {
        
        Double dNumero = Double.valueOf(JOptionPane.showInputDialog("Digite um Número"));

        if(dNumero % 5 == 0)

        JOptionPane.showMessageDialog(null," O Número é Dívisivel Por Cinco: " + dNumero);

        else{
            
            JOptionPane.showMessageDialog(null,"O Número Não é Dívisivel Por Cinco: " + dNumero);
        }
    }
}