import javax.swing.JOptionPane;

public class ex2{
    public static void main(String[] args) {
        
        int iNumero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));
        int iNumero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro Numero"));
        int iResultado = iNumero1+iNumero2;
        int iSubtracao;

        if(iResultado <=20){
            iSubtracao = iResultado - 5;
            System.out.println("A subtracao por 5 e" + " " + iSubtracao);
        }
        else{
            System.out.println("Resultado e" + " " + iResultado);
        }
        }
    }

