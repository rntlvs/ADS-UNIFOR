public abstract class Pessoa {
    //atributos
    private String nome;
    private int idade;
    private String cpf;

    //métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //métodos contrutores
    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String cpf) {
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
    }

    //métodos da classe
    public void fazerAniversario() {
        setIdade(getIdade()+1);
        System.out.println("Parabéns! \uD83C\uDF82\uD83E\uDD73 " + getNome() + " acabou de completar " + getIdade() + " anos! ");
    }
}