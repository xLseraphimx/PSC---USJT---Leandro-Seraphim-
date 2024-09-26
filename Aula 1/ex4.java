import javax.swing.JOptionPane;
public class ex4{
    public static void main (String[] args){
        double sPeso = Double.parseDouble(JOptionPane.showInputDialog("Digite Seu Peso"));

        JOptionPane.showMessageDialog(null, "O Peso Informado foi " + " " + sPeso + "kg");


    }
}