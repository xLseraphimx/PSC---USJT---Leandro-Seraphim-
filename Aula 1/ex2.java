import javax.swing.JOptionPane;
public class ex2{
public static void main(String[] args) {
    //Lendo os Dados
    int Numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

    JOptionPane.showMessageDialog(null, "O valor do numero digitado é" +  " " + Numero1 );

}
}
