package ThreadConceps;

public class DeadLockPractice {
    static String thread1="Thread 1";
    static String thread2 ="Thread 2";
    public static void main(String[] args) {
    Runnable r1=(()->{
        synchronized (thread1){
            System.out.println("t1 enters thread1");
            try{
            Thread.sleep(200);}
            catch (Exception e){
                System.out.println(e);
            }

        synchronized (thread2){
            System.out.println("t1 enters thread2");
            try{
                Thread.sleep(200);}
            catch (Exception e){
                System.out.println(e);
            }
        }}

    });
        Runnable r2=(()->{
            synchronized (thread1) {
                System.out.println("t2 enters thread1");


                synchronized (thread2) {
                    System.out.println("t2 enters thread2");
                    try {
                        Thread.sleep(200);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        });
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
    }
}
