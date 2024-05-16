public class Professor extends Pessoa {
    //atributos
    private String centro;

    //métodos getters e setters
    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    //métodos contrutores
    public Professor(String nome, int idade, String cpf, String centro) {
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
        setCentro(centro);
    }

    //métodos da classe
    public void darAula() {
        System.out.println(getNome() + " está em sala de aula... \uD83D\uDC69\uD83C\uDFFD\u200D\uD83C\uDFEB\uD83D\uDCDA");
    }
}
