public class Turma{

    private String Nome;
    private String Curso;
    private int QntdAlunos;
    private int Serie;

    public Turma(String n, String c, int qa, int s){
        this.Nome = n;
        this.Curso = c;
        this.QntdAlunos = qa;
        this.Serie = s;
    }

    public String getNome(){
        return Nome;
    }

    public String getCurso(){
        return Curso;
    }

    public int getQntdAlunos(){
        return QntdAlunos;
    }

    public int getSerie(){
        return Serie;
    }
    
    public void setNome(String n){
        Nome = n;
    }

    public void setCurso(String c){
        Curso = c;
    }

    public void setQntdAlunos(int qa){
        QntdAlunos = qa;
    }

    public void setSerie(int s){
        Serie = s;
    }
}
