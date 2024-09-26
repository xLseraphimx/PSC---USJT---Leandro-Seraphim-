import javax.swing.JOptionPane;

public class ex11 {
    public static void main(String[] args) {
        
        Double dNumero = Double.valueOf(JOptionPane.showInputDialog("Digite um Número"));

        boolean bDiv3 = (dNumero % 3 == 0);
        boolean bDiv7 = (dNumero % 7 == 0);

        if(bDiv3) {
            JOptionPane.showMessageDialog(null, "O Número" + " " + dNumero + " " + "é Dívisivel Por Três");
        } else{
            JOptionPane.showMessageDialog(null, "O Número" + " " + dNumero + " " + "Não é Dívisivel Por Três");
        }
        
        if(bDiv7) {
            JOptionPane.showMessageDialog(null, "O Número" + " " + dNumero + " " + "é Dívisivel Por Sete");
        }else {
            JOptionPane.showMessageDialog(null, "O Número" + " " + dNumero + " " + "Não é Dívisivel Por Sete ");
          }    
       }
    }