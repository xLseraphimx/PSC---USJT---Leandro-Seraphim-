import javax.swing.JOptionPane;
public class ex24{
    public static void main(String[] args) {
        double sDiagonalMaior = Double.parseDouble(JOptionPane.showInputDialog("Digite a Diagonal Maior do Losango"));
        Double sDiagonalMenor = Double.valueOf(JOptionPane.showInputDialog("Digite a Diagonal Menor do Losango"));

        Double sArea = sDiagonalMaior * sDiagonalMenor/2;

        JOptionPane.showMessageDialog(null,"A Área do Losango é" + " " + sArea);
    }
}