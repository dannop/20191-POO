package aula12_somatorio;

public class SomatorioIneficiente {
    
    public static int soma(int min, int max){
        int res = 0;
        
        for (int i=min; i<=max; i++){
            res+=i;
        }
        
        return res;
    }
}
