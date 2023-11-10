package pratica05;

public class BaseDados {
    public Professor[] professorV(){
        Professor[]professores=new Professor[2];
        Professor professor;
        Disciplina disciplina;
        Curso curso;
        for (int i = 0; i < professores.length; i++) {
            professor=new Professor();
            disciplina= new Disciplina();
            curso= new Curso();
            professor.setNome("PROF"+(i+1));
            professor.setId(i+1);
            disciplina.setId(i+1);
            disciplina.setSigla("DISC"+(i+1));
            disciplina.setDescricao("DISCIPLINA"+(i+1));
            curso.setId(i+1);
            curso.setSigla("CUR"+(i+1));
            curso.setDescricao("CURSO"+(i+1));
            disciplina.setCurso(curso);
            professor.setDisciplina(disciplina);
            professores[i]=professor;
        }
    return professores;

    }
    public Aluno[]alunoV(){
        Aluno[]alunos=new Aluno[6];
        Aluno aluno;
       Curso curso=new Curso();
        for (int i = 0; i < alunos.length; i++) {
           aluno = new Aluno();
            aluno.setId(i+1);
            aluno.setMatricula("2023"+(i+1));
            aluno.setNome("ALUNO"+(i+1));
            aluno.setCurso(curso);
            alunos[i]=aluno;

        }
    return alunos;
    }
    public Turma turma(){
        professorV();
        Turma turma=new Turma();
        professorV();
        alunoV();
        for (int i = 0 ; i < 2; i++) {
            alunoV().getClass().cast(i);
        }
        return turma;
    }
}
