import javax.swing.JOptionPane;

public class ex7{
    public static void main(String[] args) {
        
        String sNome = JOptionPane.showInputDialog("Digite o Nome");
        String sSexo = JOptionPane.showInputDialog("Digite o Sexo");
        int iIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));

        if(iIdade < 25 && (sSexo.equalsIgnoreCase("feminino") || sSexo.equalsIgnoreCase("f"))) {

            JOptionPane.showMessageDialog(null, sNome + " " + "APROVADA!");    
      } 
        else{
            JOptionPane.showMessageDialog(null, sNome + " " + "NÃO APROVADA!");
      }  
    }
}


         