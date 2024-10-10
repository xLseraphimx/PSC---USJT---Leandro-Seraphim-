import javax.swing.JOptionPane;
public class ex13 {
    public static void main(String[] args) {

        int iNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número de Três Casas Decimais"));
        
        int iResultado = iNumero / 10;
        int iResto = iNumero % 10;
        System.out.println(iResultado);
        System.out.println(iResto);
    }
}
