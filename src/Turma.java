import java.sql.SQLOutput;
import java.util.ArrayList;

public class Turma {
    //atributos;
    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    //métodos getters e setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    //construtores
    Turma(String codigo, Disciplina disciplina, Professor professor) {
        setCodigo(codigo);
        setDisciplina(disciplina);
        setProfessor(professor);
    }

    //métodos da classe
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void listarAlunos() {
        System.out.println("LISTAGEM DE ALUNOS");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i).infosAluno());
        }
    }

    public void infosTurma() {
        System.out.println("CONSULTA DE TURMAS\n");
        System.out.println(getProfessor().getCentro());
        System.out.println("COD. TURMA: " + getCodigo());
        System.out.println("DISCIPLINA: " + getDisciplina().getNome() + "(" + getDisciplina().getCodigo() + ")");
        System.out.println("DOCENTE: " + getProfessor().getNome() + "\n");
        listarAlunos();
        System.out.println("\n-------------------------- \n");
    }
}