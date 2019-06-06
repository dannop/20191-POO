package aula12_fibonacci;

public class Fibonacci extends Thread{
    private final int n;
    public int answer;
    
    public Fibonacci(int n) {
        this.n = n;
    }
    
    @Override
    public void run()  {
        if ((n < 2)){
            answer = n;
        } else {
            try {
                Fibonacci f1 = new Fibonacci(n-1);
                Fibonacci f2 = new Fibonacci(n-2);
                f1.start();
                f2.start();
                f1.join();
                f2.join();
                answer = f1.answer + f2.answer;
            }catch(InterruptedException ex) {
                System.out.println("Erro na entrada" + ex);
            }
        }
    }
    
    public int getAnswer(){
        return answer;
    }
}
