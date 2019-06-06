package aula12_somatorio;

public class Somatorio extends Thread{
    private int n;
    private int answer;
    
    public Somatorio(int n) {
        this.n = n;
    }
    
    @Override
    public void run()  {
        if ((n < 2)){
            answer = n;
        } else {
            try {
                Somatorio f1 = new Somatorio(n-1);
                Somatorio f2 = new Somatorio(n-2);
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
