package aula12_somatorio;

public class Somatorio extends Thread{
    private final int min;
    private final int max;
    private int answer;
    
    public Somatorio(int min, int max) {
        this.min = min;
        this.max = max;
    }
    
    @Override
    public void run()  {
        for(int i = min; i<=max; i++){
            answer += i;
        }
    }
    
    public void somar(){
	try {
            Somatorio s1 = new Somatorio(min, (max/2)-1);
            Somatorio s2 = new Somatorio(max/2, max);
            s1.start();
            s2.start();
            s1.join();
            s2.join();
            answer = s1.getAnswer() + s2.getAnswer();
        } catch (InterruptedException ex) {
            System.out.println("Erro na entrada" + ex);
        }
    }
    
    public int getAnswer(){
        return answer;
    }
}
