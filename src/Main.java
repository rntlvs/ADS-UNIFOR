
public class Main {
    public static void main(String[] args) {
        System.out.println("##########################");
        System.out.println("### MINHA UNIVERSIDADE ###");
        System.out.println("########################## \n");

        Disciplina disciplina001 = new Disciplina("Q28","História da Arte no Brasil", 4);
        Disciplina disciplina002 = new Disciplina("K41", "Teoria da Arte e Estética", 3);
        Disciplina disciplina003 = new Disciplina("C07", "Interatividade, Arte e Tecnologia", 5);

        Aluno aluno001 = new Regular( "AL-0687","Celendine Goold", 19, "934.966.563-87");
        Aluno aluno002 = new Regular( "AL-5292","Flambard Whitfoot", 35, "735.859.293-03");
        Aluno aluno003 = new Bolsista( "AL-7395","Estella Gardner", 27, "896.355.823-15");

        Professor professor001 = new Professor("Cosimo Greenhand",41,"323.941.423-67","Centro de Humanidades");

        Visitante visitante001 = new Visitante("Adelard Tûk", 22, "880.792.243-66");
        Visitante visitante002 = new Visitante("Jemima Brockhouse", 17, "318.165.653-42");

        Turma turma001 = new Turma("T79422", disciplina001, professor001);
        turma001.adicionarAluno(aluno001);
        turma001.adicionarAluno(aluno002);
        turma001.adicionarAluno(aluno003);
        Turma turma002 = new Turma("T57636", disciplina002, professor001);
        turma002.adicionarAluno(aluno001);
        turma002.adicionarAluno(aluno002);
        turma002.adicionarAluno(aluno003);
        Turma turma003 = new Turma("T89236", disciplina003, professor001);
        turma003.adicionarAluno(aluno001);
        turma003.adicionarAluno(aluno002);
        turma003.adicionarAluno(aluno003);

        //imprimindo em tela as informações das turmas
        turma001.infosTurma();
        turma002.infosTurma();
        turma003.infosTurma();
    }
}