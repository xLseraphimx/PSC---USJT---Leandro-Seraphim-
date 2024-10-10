public class Disciplina{

    private String Nome;
    private String Professor;
    private int Semestre;
    private boolean Ofertada;

    public Disciplina(String n, String p, int s){
        this.Nome = n;
        this.Professor = p;
        this.Semestre = s;
        this.Ofertada = false;
     }

     public String getNome(){
        return Nome;
     }

     public String getProfessor(){
        return Professor;
     }

     public int getSemestre(){
        return Semestre;
     }

     public boolean getOfertada(){
        return Ofertada;
     }

     public void SetNome(String n){
        Nome = n;
     }

     public void setProfessor(String p){
        Professor = p;
     }

     public void setSemestre(int s){
        Semestre = s;
     }

     public void setOfertada(boolean o){
        Ofertada = o;
     }
}