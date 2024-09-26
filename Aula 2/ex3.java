import javax.swing.JOptionPane;

public class ex3{
    public static void main(String[] args) {
        
        Double sNumero = Double.valueOf(JOptionPane.showInputDialog("Digite um numero"));

        if(sNumero > 0)
        System.out.println("A raiz do numero e" + " " + Math.sqrt(sNumero));

        else{
            System.out.println("O Quadrado e" + " " + Math.pow(sNumero, 2));
        }
    }
}