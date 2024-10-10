    import javax.swing.JOptionPane;

public class ex6{
    public static void main(String[] args) {
        int sNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));

        if(sNumero > 20)
        System.out.println("O Numero e Maior que 20");

        else if (sNumero==20) {
            System.out.println("O numero e igual a 20");
        }
        else{
            System.out.println("o Numero e Menor Do Que 20");
        }
    }
}