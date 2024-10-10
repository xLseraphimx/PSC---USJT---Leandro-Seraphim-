import javax.swing.JOptionPane;
public class ex12{
    public static void main(String[] args) {
        
        double dNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite um Número"));

        boolean bDiv10 = (dNumero % 10 == 0);
        boolean bDiv5 = (dNumero % 5 == 0);
        boolean bDiv2 = (dNumero % 2 == 0);

        if (bDiv10){
            JOptionPane.showMessageDialog(null, "O Número" + " " + dNumero + " " + "É Dívisivel por Dez");                        
        } else{
            JOptionPane.showMessageDialog(null,"O Número" + " " + dNumero + " " + "Não é Dívisivel por Dez");
        }
        if(bDiv5){
            JOptionPane.showMessageDialog(null, "O Número" + " " + dNumero + " " + "É Dívisivel por Cinco");
        } else{
            JOptionPane.showMessageDialog(null,"O Número" + " " + dNumero + " " + "Não é Dívisivel por Cinco");
        }
        if(bDiv2){
            JOptionPane.showMessageDialog(null,"O Número" + " " + dNumero + " " + "É Dívisivel por Dois");            
        } else{
            JOptionPane.showMessageDialog(null, "O Número" + " " + dNumero + " " + "Não é Dívisivel por Dois"); 
        } 
        }
    } 