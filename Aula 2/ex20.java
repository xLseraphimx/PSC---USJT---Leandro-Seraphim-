import javax.swing.JOptionPane;
public class ex20{
    public static void main(String[] args) {
        
        int iNumero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));
        int iNumero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));

        if(iNumero1 < iNumero2){
            JOptionPane.showMessageDialog(null, "O Quadrado do Menor Número é ("+ iNumero1 +") é " + Math.pow(iNumero1, 2));

        } else{
            JOptionPane.showMessageDialog(null, "A Raiz do Maior Número é ("+ iNumero1 + ") é " + Math.sqrt(iNumero1));
        }   
    }
}