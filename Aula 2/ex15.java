import javax.swing.JOptionPane; 
public class ex15{
    public static void main(String[] args) {

        int iNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano do Seu Nascimento"));
        int iAnoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano Atual"));
        int iResultado = iAnoAtual - iNascimento;

        if(iAnoAtual > 1000 && iAnoAtual <= 9999)
        JOptionPane.showMessageDialog(null, "Sua idade é " + iResultado + " Anos" );

        else{
        JOptionPane.showMessageDialog(null, "Data Inválida");
        }
    }
}