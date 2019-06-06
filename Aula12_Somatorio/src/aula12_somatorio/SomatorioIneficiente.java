package aula12_somatorio;

public class SomatorioIneficiente {
    
    public static int soma(int max){
        int res = 0;
        
        for (int i=0; i<=max; i++){
            res+=i;
        }
        
        return res;
    }
}
