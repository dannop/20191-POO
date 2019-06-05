
package exercicio_colecao_3;

import java.util.ArrayList;
import java.util.List;

public class Lista_Alunos {
    public List<Alunos> lista_alunos = new ArrayList<>();
    
    public void  novo_aluno(String nome,String cpf, String matricula, String email){
       lista_alunos.add(new Alunos(nome, cpf, matricula, email));
    }
    public void encontra_por_matricula(String matricula){
        for (int i = 0;  i < lista_alunos.size() ; i++ ){
            System.out.println(this.lista_alunos.get(i).get_matricula());
            if (this.lista_alunos.get(i).get_matricula().equals(matricula))
               lista_alunos.get(i).print_aluno();
        }
    }
}
