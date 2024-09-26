import javax.swing.JOptionPane;
public class ex1
{
public static void main(String[] args)
{
//lendo os dados
      String sPalavra1 = JOptionPane.showInputDialog(
      "Digite a primeira Palavra:");
      String sPalavra2 = JOptionPane.showInputDialog(
      "Digite sua segunda Palavra:");
      String sPalavra3 = JOptionPane.showInputDialog(
      "Digite sua terceira Palavra");

JOptionPane.showMessageDialog(null, sPalavra3 + " " + sPalavra2 + " " + sPalavra1);
}
}