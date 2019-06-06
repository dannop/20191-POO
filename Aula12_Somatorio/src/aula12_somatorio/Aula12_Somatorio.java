package aula12_somatorio;

//author: Camila Camilo, Daniel Lessa, Maria Clara Mussi, Matheus Machado

public class Aula12_Somatorio {

    public static void main(String[] args) {
        long inicio, fim, tempo;
        int num_teste = 10;
        
        inicio = System.currentTimeMillis();
        int primeiro_res = SomatorioIneficiente.soma(num_teste);
        System.out.println("Primeiro resultado: " + primeiro_res);
        fim = System.currentTimeMillis();
        tempo = fim - inicio; System.out.println("Tempo gasto: " + tempo);
        
        inicio = System.currentTimeMillis();
        Somatorio segundo_res = new Somatorio(num_teste);
        try {
            segundo_res.start();
            segundo_res.join();
            System.out.println("Segundo resultado:" + segundo_res.getAnswer());
        }catch(InterruptedException ex) {
            System.out.println("Erro na entrada" + ex);
        }
        fim = System.currentTimeMillis();
        tempo = fim - inicio; System.out.println("Tempo gasto: " + tempo);
    }
    
}
