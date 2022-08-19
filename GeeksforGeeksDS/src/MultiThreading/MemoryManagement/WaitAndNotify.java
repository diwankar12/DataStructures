package MultiThreading.MemoryManagement;




public class WaitAndNotify {

    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("In produce method");
            wait();
            System.out.println("doing some calculation");
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this){
            Thread.sleep(5000);
            System.out.println("In consume method");
            notify();
            System.out.println("Once the synchronized block finishes then it calls produce method ");
        }
    }



    public static void main(String[] args) {

        WaitAndNotify process = new WaitAndNotify();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    process.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    process.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }





}
