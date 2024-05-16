public class Aluno extends Pessoa {
    //atributos
    private String matricula;
    private Boolean temBolsa;


    //métodos getters e setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTemBolsa() {
        String bolsista;
        if (temBolsa == true) {
            bolsista = "sim";
        } else {
            bolsista = "não";
        }
        return bolsista;
    }

    public void setTemBolsa(Boolean temBolsa) {
        this.temBolsa = temBolsa;
    }

    //métodos construtores
    public Aluno() {

    }

    public Aluno(String matricula, String nome, int idade, String cpf) {
        setMatricula(matricula);
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
    }

    //métodos da classe
    public void pagarMensalidade() {

    }

    public String infosAluno() {
        return "mat.: " + getMatricula() + " | nome: " + getNome() + " | doc.: " + getCpf() + " | bolsista: " + getTemBolsa();
    }

//    @Override
//    public String toString() {
//        return "nome: " + getNome() + ", matricula: " + matricula;
//    }
}
