
package exercicio_colecao_3;

import java.util.Scanner;

public class Exercicio_Colecao_3 {
    public static Lista_Alunos lista = new Lista_Alunos();
    
    public static void main(String[] args) {
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("Digite <1> para adicionar um novo aluno\nDigite <2> para encontrar um  aluno ");
            int opcao = input.nextInt();
            switch(opcao){
                case 1:
                    novo_aluno();
                    break;
                case 2:
                    encontra_aluno();
                    break;
            }
        }
    }
    public static void novo_aluno(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome = input.next();
        System.out.println("Digite o email do aluno");
        String email = input.next();
        System.out.println("Digite o matricula do aluno");
        String matricula = input.next();
        System.out.println("Digite o cpf do aluno");
        String cpf = input.next();
        lista.novo_aluno(nome, cpf, matricula, email);
        
    }
    
    public static void encontra_aluno(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o matricula do aluno");
        String matricula = input.next();
        lista.encontra_por_matricula(matricula);
    }
    
}
