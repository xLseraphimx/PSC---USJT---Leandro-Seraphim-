import javax.swing.JOptionPane;

public class TesteDisciplina{
    public static void main(String[] args) {
        
        String Nome =JOptionPane.showInputDialog("Digite o Nome da Disciplina");
        String Professor = JOptionPane.showInputDialog("Digite o Nome do Professor");
        int Semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o Semestre"));

        Disciplina disciplina = new Disciplina(Nome, Professor, Semestre);

        String DadosDisciplina = "Nome: " + disciplina.getNome() + "\nProfessor: " + disciplina.getProfessor() + "\nSemestre: " + disciplina.getSemestre() + "°";

        if(disciplina.getOfertada()){
            DadosDisciplina += "\nOfertado: Sim";
        }else{
            DadosDisciplina += "\nOfertado: Não";
        }

        JOptionPane.showMessageDialog(null, DadosDisciplina);
    }
}