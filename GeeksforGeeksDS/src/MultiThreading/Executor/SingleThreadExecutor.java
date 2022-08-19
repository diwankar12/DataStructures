package MultiThreading.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Tasks implements Runnable{

    public int id ;

    public Tasks(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Tasks with id "+id +" is running "+Thread.currentThread().getName());
        long duration = (long) (Math.random() * 5);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SingleThreadExecutor {


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i=0;i<5;i++){
             executorService.execute(new Tasks(i));
        }
        executorService.shutdown();
    }
}
