package ThreadConceps;

class Counter{
    int counts=0;
    public synchronized void count(){
        counts++;
    }
}
public class ThreadPractice {


    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();


        Runnable r1=(()->{
           for(int i=0;i<10000;i++){
               c.count();
           }
        });



        Runnable r2=(()->{
                for(int i=0;i<10000;i++){
                c.count();
                }
        });
Thread t2=new Thread(r2);
Thread t1=new Thread(r1);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.counts);
    }
}
