package aula12_fibonacci;

public class Aula12_Fibonacci {

    public static void main(String[] args) {
        FibonacciIneficiente first_test = new FibonacciIneficiente();
        first_test.show(10);
        
        Fibonacci second_test = new Fibonacci(10);
        try {
            second_test.start();
            second_test.join();
            System.out.println("Resposta:" + second_test.getAnswer());
        }catch(InterruptedException ex) {
            System.out.println("Erro na entrada" + ex);
        }
    }
    
}
