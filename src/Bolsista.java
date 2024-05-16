public class Bolsista extends Aluno {
    //métodos contrutores
    public Bolsista(String matricula, String nome, int idade, String cpf) {
        setMatricula(matricula);
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
        setTemBolsa(true);
    }

    //métodos da classe
    @Override
    public void pagarMensalidade() {
        System.out.println("Aluno(a) bolsista. Isento do pagamento.");
    }

//    @Override
//    public String toString() {
//        return "nome: " + getNome() + ", matricula: " + getMatricula();
//    }
}
