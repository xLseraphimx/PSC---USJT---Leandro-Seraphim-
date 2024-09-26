import javax.swing.JOptionPane;

public class ex1{
    public static void main(String[] args) {
        
        int iNumero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));
        int iNumero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Segundo Numero"));

        int iResultado = iNumero1+iNumero2;

            if(iNumero1 + iNumero2 > 10)

            System.out.println("O Resultado e " + iResultado);

            else{
                System.out.println("Numero Abaixo de 10");
            }
    }
}