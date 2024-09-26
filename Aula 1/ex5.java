import javax.swing.JOptionPane;
public class ex5{
    public static void main(String[] args) {
        String sCaractere1 = JOptionPane.showInputDialog("digite a primeira letra");
        String sCaractere2 = JOptionPane.showInputDialog("digite a segunda letra");
        String sCaractere3 = JOptionPane.showInputDialog("digite a terceira letra");
        String sCaractere4 = JOptionPane.showInputDialog("digite a quarta letra");
        String sCaractere5 = JOptionPane.showInputDialog("digite a quinta letra");
        String sCaractere6 = JOptionPane.showInputDialog("digite a sexta letra");
        String sCaractere7 = JOptionPane.showInputDialog("digite a setima letra");
        String sCaractere8 = JOptionPane.showInputDialog("digite a oitava letra");
        String sCaractere9 = JOptionPane.showInputDialog("digite a nona letra");
        String sCaractere10 = JOptionPane.showInputDialog("digite a decima letra");

        JOptionPane.showMessageDialog(null, "Sua palavra de 10 caracteres é" + " " + sCaractere1 + sCaractere2 + sCaractere3 + sCaractere4 + sCaractere5
        + sCaractere6 + sCaractere7 + sCaractere8 + sCaractere9 + sCaractere10);
    }
}