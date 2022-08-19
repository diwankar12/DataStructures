package MultiThreading.ThreadManipulation;

public class RunnableAndThread {






    public static void main(String[] args) {

        Thread t1 = new Thread(new workerRunnable());
        Thread t2 = new Thread(new workerThread());
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("i am finished");
    }




}

class workerRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<2;i++){
            System.out.println("runnable interface ");
        }

    }
}


class workerThread extends Thread{

    @Override
    public void run() {
        System.out.println("thread class ");
    }
}