
package exercicio_colecao_3;

import java.util.HashMap;

public class Lista_Alunos {
    public HashMap<String,Alunos> lista_alunos = new HashMap<>();
    public void  novo_aluno(String nome,String cpf, String matricula, String email){
       lista_alunos.put(matricula,new Alunos(nome, cpf, matricula, email));
    }
    public void encontra_por_matricula(String matricula){
        Alunos aluno = lista_alunos.get(matricula);
        if (aluno != null) aluno.print_aluno();
        return;
    }
}
