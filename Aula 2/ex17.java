import javax.swing.JOptionPane;

public class ex17{
    public static void main(String[] args) {
        
        Double dNumero = Double.valueOf(JOptionPane.showInputDialog("Digite um Número"));
        Double dNumero2 = Double.valueOf(JOptionPane.showInputDialog("Digite um Número"));

        if(dNumero < dNumero2)
        JOptionPane.showMessageDialog(null, "O Menor Número é " + dNumero);

        else{
            JOptionPane.showMessageDialog(null, "O Menor Número é " + dNumero2);
        }
    }
}