import javax.swing.JOptionPane;

public class ex5{
    public static void main(String[] args) {
        
        double sNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite um Numero"));

        if(sNumero>=20 && sNumero <= 90 ) 
        System.out.println("O Numero esta compreendido entre vinte e noventa." + " " + "E seu Numero e: " + " " + sNumero);

        else{
            System.out.println("O Numero nao esta compreendido entre vinte e noventa.");
        }
    }
}