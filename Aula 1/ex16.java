import javax.swing.JOptionPane;
public class ex16{
    public static void main(String[] args) {
        
        int iData = Integer.parseInt(JOptionPane.showInputDialog("Digite uma Data no Estilo ddmmaa"));

        int iDia = iData / 10000;
        int iMes = (iData / 100) % 100;
        int iAno = iData % 100;

        JOptionPane.showMessageDialog(null, "O Dia é: " + iDia + "\nO Mês é: " + iMes + "\nO Ano é: " + iAno); 
    }
}