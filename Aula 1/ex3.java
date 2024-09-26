import javax.swing.JOptionPane;
public class ex3{
    public static void main(String[] args) {

    int sDia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do seu nascimento"));
    int sMes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes do seu nascimento"));
    int sAno = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento")); 

    JOptionPane.showMessageDialog(null, "Voce nasceu em" + sDia + "/" + sMes + "/" + sAno);
    }  
}