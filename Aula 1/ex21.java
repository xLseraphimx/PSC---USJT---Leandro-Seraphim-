import javax.swing.JOptionPane;
public class ex21{
    public static void main(String[] args) {
        
        int iDividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Dividendo"));
        int iDivisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o Divisor"));

        double dQuociente = iDividendo / iDivisor;
        double dResto = iDividendo % iDivisor;

        JOptionPane.showMessageDialog(null,"O Dividendo é: " + iDividendo + "\nO Divisor é: " + iDivisor + 
        "\nO Quociente é: " + dQuociente + "\nO Resto é" + dResto);
    }
}