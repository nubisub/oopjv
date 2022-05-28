public class ThreadB extends Thread{
    @Override
    public void run(){
        for (int i=0; i<10000;i++){
            System.out.println("Thread B: "+ i );
        }
    }
}