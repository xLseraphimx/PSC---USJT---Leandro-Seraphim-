import javax.swing.JOptionPane;
public class ex11{
    public static void main(String[] args) {

        double sValordivida = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Cartão de Crédito"));
        double sValorJuros =  Double.parseDouble(JOptionPane.showInputDialog("Digite a Porcentagem em Valor Real "));
        double sMes = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número de Meses"));

        double sTotal = sValordivida * Math.pow((1 + sValorJuros/100), sMes);

        JOptionPane.showMessageDialog(null,"O valor de Sua Dívida com Juros é" + " " + sTotal);

    }
}