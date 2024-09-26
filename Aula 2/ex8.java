import javax.swing.JOptionPane;

public class ex8{
    public static void main(String[] args) {
        
        int iNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));
        int iNumero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));


        if(iNumero > iNumero2)
        System.out.println("O Maior Numero e: " + iNumero);

        else{
            System.out.println("O Maior Numero e: " + iNumero2);
        }
    }
}