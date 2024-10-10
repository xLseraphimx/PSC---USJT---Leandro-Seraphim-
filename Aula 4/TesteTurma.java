import javax.swing.JOptionPane;
public class TesteTurma{
    public static void main(String[] args) {
        
        String Nome = JOptionPane.showInputDialog("Digite o Nome da Turma");
        String Curso = JOptionPane.showInputDialog("Digite o Nome do Curso");
        int QntdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Alunos"));
        int Serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a Serie"));

        Turma turma = new Turma(Nome, Curso, QntdAlunos, Serie);

        String dadosturma = "Nome: " + turma.getNome() + "\nCurso: " + 
                             turma.getCurso() + "\nQuantidade de Alunos: " + 
                             turma.getQntdAlunos() + "\nSerie: " + turma.getSerie() + "° Semestre";

        JOptionPane.showMessageDialog(null, dadosturma);

        QntdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a Nova Quantidade de Alunos"));

        turma.setQntdAlunos(QntdAlunos);

        dadosturma = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + 
                     "\nQuantidade de Alunos: " + turma.getQntdAlunos() + 
                     "\nSerie: " + turma.getSerie() + "° Semestre";

        JOptionPane.showMessageDialog(null, dadosturma);  

    }
}