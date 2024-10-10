import javax.swing.JOptionPane;
public class ex23{
    public static void main(String[] args) {
        
        int iMaior = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));
        int iIntermediario = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));
        int iMenor = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));

        if(iMaior > iIntermediario && iMaior > iMenor && iIntermediario < iMaior && iIntermediario > iMenor && iMenor < iMaior && iMenor < iIntermediario){
            JOptionPane.showMessageDialog(null, "O Maior Número é: " + iMaior + "\nO Número Intermediário é: " + iIntermediario + "\n O Menor Número é: " + iMenor);
        }
    }
}