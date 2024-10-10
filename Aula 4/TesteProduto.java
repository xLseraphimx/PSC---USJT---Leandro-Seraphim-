import javax.swing.JOptionPane;

public class TesteProduto{
    public static void main(String[] args) {
        
        String Nome = JOptionPane.showInputDialog("Digite o Nome do Produto");
        double Preço = Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço do Produto")); 
        int Quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade dos Produtos"));

        Produto produto = new Produto(Nome, Preço, Quantidade);

        String DadosProduto = "Produto: " + produto.getNome() + "\nPreço: " + produto.getPreço() + " Kg" + "\nQuantidade: " + produto.getQuantidade();

        JOptionPane.showMessageDialog(null, DadosProduto);
    }
}