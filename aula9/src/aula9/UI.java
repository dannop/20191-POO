package aula9;

import java.util.Scanner;

public class UI {
    public static int executaMenu(int option, int memoria){
        int num;
        switch (option) {
            case 1:
                System.out.print("Digite o numero: ");
                num = recebeNumero();
                memoria = Calculadora.soma(memoria, num);
                break;
            case 2:
                System.out.print("Digite o numero: ");
                num = recebeNumero();
                memoria = Calculadora.subtrai(memoria, num);
                break;
            case 3:
                System.out.print("Digite o numero: ");
                num = recebeNumero();
                memoria = Calculadora.multiplica(memoria, num);
                break;
            case 4:
                System.out.print("Digite o numero: ");
                num = recebeNumero();
                memoria = Calculadora.divide(memoria, num);
                break;
            case 5:
                memoria = Calculadora.limpa();
                break;
            case 6:
                break;
            default:
                 System.out.println("Esta operacao nao e valida!");
         }
        
        return memoria;
    }
    
    public static void exibeMenu(int memoria){
       System.out.println("Estado da memoria: "+memoria);
       System.out.println("Opcoes:");
       System.out.println();
       System.out.println("(1) Somar");
       System.out.println("(2) Subtrair");
       System.out.println("(3) Multiplicar");
       System.out.println("(4) Dividir");
       System.out.println("(5) Limpar memoria");
       System.out.println("(6) Sair do programa");
       System.out.println();
       System.out.print("Qual opcao voce deseja?");
    }
    
    public static void resultado(){
        int menu_option = 0;
        int memoria_atual = 0;
        do{
            UI.exibeMenu(memoria_atual);
            menu_option = UI.recebeNumero();
            memoria_atual = UI.executaMenu(menu_option, memoria_atual);
        }while(menu_option != 6);
    }
    
    public static int recebeNumero(){
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        
        return num;
    }
}
