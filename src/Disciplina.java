public class Disciplina {
    //atributos
    private String codigo;
    private String nome;
    private int semestre;

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    //construtores
        public Disciplina(String codigo, String nome, int semestre) {
        setCodigo(codigo);
        setNome(nome);
        setSemestre(semestre);
    }
}
