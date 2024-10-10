import javax.swing.JOptionPane;

public class ex16{
    public static void main(String[] args) {
        
        int iNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));
        int iNumero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));

        if(iNumero == iNumero2)
        JOptionPane.showMessageDialog(null, "Os Números São Iguais");

        else{
        JOptionPane.showMessageDialog(null,"Os Números São Diferentes");
        }
    }
}