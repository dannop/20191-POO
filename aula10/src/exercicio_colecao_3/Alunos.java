package exercicio_colecao_3;

public class Alunos {
    private String nome ,matricula, cpf, email;
    
    public Alunos(String nome, String cpf, String matricula, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.email = email;
    }
    public String get_matricula(){
      return this.matricula;
    }
    public Alunos get_Aluno(){
        return this;
    }
    public void print_aluno(){
        System.out.println("O aluno "+this.nome+" de CPF " +this.cpf+" e de matricula "+ this.matricula +" foi encontrado e seu email é "+this.email);
    }
}
