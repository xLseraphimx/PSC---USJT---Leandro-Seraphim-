import javax.swing.JOptionPane;
public class ex18{
    public static void main(String[] args) {
    String sDia = JOptionPane.showInputDialog("Escreva Seu Dia de Nascimento");
    String sMes = JOptionPane.showInputDialog("Escreva Seu Mes de Nascimento");
    String sAno = JOptionPane.showInputDialog("Escreva Seu Ano de Nascimento");

    JOptionPane.showMessageDialog(null,"Seu dia de Nascimento é: " + sDia + "\nSeu Mes de Nascimento é: " + sMes + "\nSeu Ano de Nascimento é: " + sAno );
    
          }
    }