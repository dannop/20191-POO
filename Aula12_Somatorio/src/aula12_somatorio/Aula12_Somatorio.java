package aula12_somatorio;

//author: Camila Camilo, Daniel Lessa, Maria Clara Mussi, Matheus Machado

public class Aula12_Somatorio {

    public static void main(String[] args) {
        long inicio, fim, tempo;
        int num_teste_min = 0;
        int num_teste_max = 10;
        
        //Primeiro teste
        inicio = System.currentTimeMillis();
        int primeiro_res = SomatorioIneficiente.soma(num_teste_min, num_teste_max);
        System.out.println("Primeiro resultado: " + primeiro_res);
        fim = System.currentTimeMillis();
        tempo = fim - inicio; System.out.println("Tempo gasto: " + tempo);
        
        //Segundo teste
        inicio = System.currentTimeMillis();
        Somatorio segundo_res = new Somatorio(num_teste_min, num_teste_max);
        segundo_res.somar();
        System.out.println("Segundo resultado:" + segundo_res.getAnswer());
        fim = System.currentTimeMillis();
        tempo = fim - inicio; System.out.println("Tempo gasto: " + tempo);
    }
    
}
