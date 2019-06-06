package aula12_fibonacci;

public class FibonacciIneficiente {
    public static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }
    
    public void show(int n){
        for (int i = 0; i <= n; i++) {
            System.out.print("(" + i + "):" + FibonacciIneficiente.fibo(i) + "\t");
        }
        
        System.out.println("");
    }
}
