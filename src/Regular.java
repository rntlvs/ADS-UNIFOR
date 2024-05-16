public class Regular extends Aluno {
    //métodos contrutores
    public Regular( String matricula, String nome, int idade, String cpf) {
        setMatricula(matricula);
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
        setTemBolsa(false);
    }

    //métodos da classe
    @Override
    public void pagarMensalidade() {
        System.out.println("Aluno(a) regular. Mensalidade paga!");
    }
}